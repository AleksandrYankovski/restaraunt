package service.impl;

import dao.DAOFactory;
import dao.ProductDAO;
import dao.exeption.DAOException;
import dao.impl.DAOFactoryImpl;
import service.UserService;
import service.exception.ServiceException;
import entity.*;

import java.util.List;

public class UserServiceImpl implements UserService {
    private static final DAOFactory daoFactory = DAOFactoryImpl.getInstance();


    public List<Product> getProducts() throws ServiceException {
        try {
            ProductDAO productDAO = daoFactory.getProductDAO();
            return productDAO.getProducts();
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }

    @Override
    public void registrate(User user) throws ServiceException {

    }

    @Override
    public boolean isNewUser(User user) {
        return true;
    }


}
