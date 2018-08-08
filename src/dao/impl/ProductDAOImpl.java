package dao.impl;

import dao.ProductDAO;
import dao.connection.ConnectorDB;
import entity.Product;
import dao.exeption.DAOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    private static final String GET_PRODUCTS = "SELECT products.id,products.name,products.price," +
            "products.fat,products.protein,products.carbohydrates,products.novelty,products.discont," +
            "products.productsRole FROM products";
    private static final String ADD_PRODUCT = "INSERT INTO products (products.name,products.price," +
            "products.fat,products.protein,products.carbohydrates,products.novelty,products.discont," +
            "products.productsRole) values(?,?,?,?,?,?,?,?)";
    private static final String DELETE_PRODUCT = "DELETE FROM products WHERE id=?";
    private static final String UPDATE_PRODUCT = "UPDATE products SET products.name=?,products.price=?," +
            "products.fat=?,products.protein=?,products.carbohydrates=?,products.novelty=?,products.discont=?," +
            "products.productsRole=? WHERE id=?";
    private static final String GET_PRODUCT = "SELECT products.id,products.name,products.price," +
            "products.fat,products.protein,products.carbohydrates,products.novelty,products.discont," +
            "products.productsRole FROM products WHERE id=?";


    public ProductDAOImpl() {

    }

    @Override
    public void add(Product product) throws DAOException {
        //    Connection connection = ConnectorDB.getConnection();

        throw new UnsupportedOperationException();
    }

    @Override
    public List<Product> getProducts() throws DAOException {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean delete(Integer id) throws DAOException {

        throw new UnsupportedOperationException();
        //   Connection connection = ConnectorDB.getConnection();
    }

    @Override
    public boolean update(int id, Product product) throws DAOException {
        //  Connection connection = ConnectorDB.getConnection();
        throw new UnsupportedOperationException();
    }

    @Override
    public Product get(int id) throws DAOException {
        throw new UnsupportedOperationException();

    }
}
