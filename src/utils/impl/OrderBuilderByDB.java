package utils.impl;

import entity.*;
import utils.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderBuilderByDB implements OrderBuilder {
    private Order order;
    private ResultSet resultSet;

    public OrderBuilderByDB(ResultSet resultSet) {
        this.resultSet = resultSet;
    }


    @Override
    public void createOrder() {
        order = new Order();

    }

    @Override
    public void buildClient() throws SQLException {

        User user = new User();

        user.setLogin(resultSet.getString("users.login"));
        user.setPassword(resultSet.getString("users.password"));
        user.setName(resultSet.getString("users.name"));
        user.setSurname(resultSet.getString("users.surname"));
        user.setPhoneNumber(resultSet.getString("users.phoneNumber"));

        order.setUser(user);
    }

    @Override
    public void buildOrderInfo() throws SQLException {
        order.setId(resultSet.getInt("orders.id"));
        order.setDate(resultSet.getDate("orders.date"));
        order.setTime(resultSet.getTime("orders.time"));
        order.setSummaryPrice(resultSet.getDouble("orders.summaryPrice"));
        order.setOrderStatus(OrderStatus.valueOf(resultSet.getString("orders.status")));
    }

    @Override
    public void buildFullOrder() throws SQLException {
          createOrder();
          buildOrderInfo();
          buildClient();
    }

    @Override
    public Order getOrder() {
        return order;
    }
}
