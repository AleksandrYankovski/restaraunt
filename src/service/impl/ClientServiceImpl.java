package service.impl;

import dao.*;
import dao.connection.ConnectorDB;
import entity.Order;
import entity.Product;
import dao.exeption.DAOException;
import dao.impl.DAOFactoryImpl;
import service.ClientService;
import service.exception.ServiceException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ClientServiceImpl implements ClientService {
    private static final DAOFactory daoFactory = DAOFactoryImpl.getInstance();


    @Override
    public boolean createOrder(String loginUser, String passwordUser) throws ServiceException {

        try {
            OrderDAO orderDAO = daoFactory.getOrderDAO();

            boolean orderCreate = orderDAO.create(loginUser, passwordUser);

            return orderCreate;
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }


    @Override
    public boolean addProductToBasket(Integer idOrder, Integer idProduct) throws ServiceException {
        return true;
    }



    @Override
    public List<Order> getOrders(String loginUser, String passwordUser) throws ServiceException {
        try {
            OrderDAO orderDAO = daoFactory.getOrderDAO();
            return orderDAO.getAll(loginUser, passwordUser);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public List<Order> getOrders() throws ServiceException {
        try {
            OrderDAO orderDAO = daoFactory.getOrderDAO();
            return orderDAO.getAll();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public boolean checkout(String loginUSer, String passwordUser, Integer idOrder,
                            Boolean accumulate) throws ServiceException {

        Connection connection = ConnectorDB.getInstance().getConnection();

        OrderDAO orderDAO = daoFactory.getOrderDAO();
        DiscontCardDAO discontCardDAO = daoFactory.getDiscontCardDAO();
        Double discontByUserCard = 0.0;

        try {
            connection.setAutoCommit(false);

            if (accumulate) {
                Double summaryPrice = orderDAO.getLastByIdUser(loginUSer, passwordUser).getSummaryPrice();
                discontCardDAO.accumulate(summaryPrice, loginUSer, passwordUser);
            } else {
                discontByUserCard = discontCardDAO.getByUser(loginUSer, passwordUser).getAccumulation();
                discontCardDAO.updateFromOriginal(loginUSer, passwordUser);
            }
            orderDAO.update(discontByUserCard, idOrder, "PAID");
            return true;

        } catch (DAOException | SQLException e) {
            try {
                orderDAO.update(discontByUserCard, idOrder, "NOT_PAID");
                connection.rollback();
            } catch (DAOException | SQLException e1) {
                throw new ServiceException(e.getMessage(), e);
            }
            throw new ServiceException(e.getMessage(), e);
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
                throw new ServiceException(e.getMessage(), e);
            }
        }

    }


}


