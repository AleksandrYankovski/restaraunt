package dao.impl;

import dao.*;

public class DAOFactoryImpl implements DAOFactory {

    private static final DAOFactoryImpl instance = new DAOFactoryImpl();

    private UserDAO userDAO = new UserDAOImpl();
    private OrderDAO orderDAO = new OrderDAOImpl();
    private ProductDAO productDAO = new ProductDAOImpl();
    private OrderToProductDAO orderToProductDAO = new OrderToProductDAOImpl();
    private DiscontCardDAO discontCardDAO = new DiscontCardDAOImpl();

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public OrderDAO getOrderDAO() {
        return orderDAO;
    }

    public ProductDAO getProductDAO() {
        return productDAO;
    }

    public OrderToProductDAO getOrderToProductDAO() {
        return orderToProductDAO;
    }

    public DiscontCardDAO getDiscontCardDAO() {
        return discontCardDAO;
    }

    public static DAOFactoryImpl getInstance() {
        return instance;
    }

    private DAOFactoryImpl() {
    }

}
