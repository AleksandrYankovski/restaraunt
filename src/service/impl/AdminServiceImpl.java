package service.impl;

import dao.DAOFactory;
import dao.ProductDAO;
import entity.Product;
import dao.exeption.DAOException;
import dao.impl.DAOFactoryImpl;
import service.AdminService;
import service.exception.ServiceException;

public class AdminServiceImpl implements AdminService {
    private static final DAOFactory daoFactory = DAOFactoryImpl.getInstance();


    @Override
    public void addProduct(Product product) throws ServiceException {
        try {
            ProductDAO productDAO = daoFactory.getProductDAO();
            productDAO.add(product);
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }

    @Override
    public boolean deleteProduct(Integer id) throws ServiceException {

        try {
            ProductDAO productDAO = daoFactory.getProductDAO();
            return productDAO.delete(id);
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }

    @Override
    public boolean updateProduct(int id, Product product) throws ServiceException {
        try {
            ProductDAO productDAO = daoFactory.getProductDAO();
            return productDAO.update(id, product);
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }


}
