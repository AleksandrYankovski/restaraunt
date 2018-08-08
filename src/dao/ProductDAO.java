package dao;


import entity.Product;
import dao.exeption.DAOException;

import java.util.List;

public interface ProductDAO {

    void add(Product product) throws DAOException;

    List<Product> getProducts() throws DAOException;

    boolean delete(Integer id) throws DAOException;

    boolean update(int id, Product product) throws DAOException;

    Product get(int id) throws DAOException;

}
