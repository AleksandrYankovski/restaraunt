package dao.impl;

import dao.OrderDAO;
import dao.connection.ConnectorDB;
import dao.exeption.DAOException;
import entity.*;
import utils.*;
import utils.impl.OrderBuilderByDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpl implements OrderDAO {


    private static final String CREATE_ORDER = "INSERT INTO orders (users_login,users_password,status)" +
            " VALUES(?,?,?)";
    private static final String GET_LAST_BY_ID_USER = "SELECT * FROM orders WHERE users_login=? " +
            "&& users_password=? ORDER BY id DESC LIMIT 1 ";
    private static final String CHANGE_PRICE = "UPDATE  orders SET summaryPrice = summaryPrice +? WHERE id=? ";
    private static final String UPDATE_BY_DISCONT = "UPDATE  orders SET discont =(SELECT SUM(discont) from products " +
            "inner join orders_has_products ON products.id=orders_has_products.products_id WHERE orders_id=?)+?," +
            "status=? ";
    private static final String GET_ORDERS_BY_USER = "SELECT * FROM users INNER JOIN orders" +
            " ON orders.users_login=users.login && orders.users_password=users.password " +
            " WHERE users_login=? && users_password=?";
    private static final String GET_ORDERS = "SELECT * FROM users LEFT JOIN orders" +
            " ON orders.users_login=users.login && orders.users_password=users.password ORDER BY users.name && users.surname";


    public OrderDAOImpl() {

    }

    @Override
    public boolean create(String loginUser, String passwordUser) throws DAOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Order getLastByIdUser(String loginUser, String passwordUser) throws DAOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean update(double value, Integer idOrder) throws DAOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean update(double valueDiscontByUser, Integer id, String status) throws DAOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Order> getAll(String loginUser, String passwordUser) throws DAOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Order> getAll() throws DAOException {
        throw new UnsupportedOperationException();
    }
}
