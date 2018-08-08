package utils;

import entity.*;

import java.sql.SQLException;

public interface DiscontCardBuilder {

    void createOrder();

    void buildClient() throws SQLException;

    void buildDiscontCardInfo() throws SQLException;

    DiscontCard getDiscontCard();
}


