package utils;

import entity.*;


import java.sql.SQLException;

public interface OrderBuilder {

    void createOrder();

    void buildClient() throws SQLException;


    void buildOrderInfo() throws SQLException;

    void buildFullOrder() throws SQLException;

    Order getOrder();
}
