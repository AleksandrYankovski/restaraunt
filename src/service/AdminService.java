package service;


import entity.Product;
import service.exception.ServiceException;

public interface AdminService {

     void addProduct(Product product) throws ServiceException;

     boolean deleteProduct(Integer id) throws ServiceException;

     boolean updateProduct(int id, Product product) throws ServiceException;

}
