package dao.impl;


import dao.OrderToProductDAO;
import dao.connection.ConnectorDB;
import dao.exeption.DAOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderToProductDAOImpl implements OrderToProductDAO {

    private static final String ADD_ORDER_TO_PRODUCT = "INSERT INTO orders_has_products" +
            " (orders_id,products_id) VALUES(?,?)";


    public OrderToProductDAOImpl() {
    }


    @Override
    public boolean add(Integer idOrder, Integer idProduct) throws DAOException {
        throw new UnsupportedOperationException();
    }
}
