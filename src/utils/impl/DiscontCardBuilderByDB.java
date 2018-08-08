package utils.impl;

import entity.*;
import utils.*;


import java.sql.ResultSet;
import java.sql.SQLException;

public class DiscontCardBuilderByDB implements DiscontCardBuilder {


    private ResultSet resultSet;
    private DiscontCard discontCard;


    public DiscontCardBuilderByDB(ResultSet resultSet) {
        this.resultSet = resultSet;
    }


    @Override
    public void createOrder() {
        discontCard = new DiscontCard();
    }

    @Override
    public void buildClient() throws SQLException {
        User user = new User();
        user.setPassword(resultSet.getString("discontCard.users_password"));
        user.setLogin(resultSet.getString("discontCard.users_login"));

        discontCard.setUser(user);

    }

    @Override
    public void buildDiscontCardInfo() throws SQLException {
        discontCard.setAccumulation(resultSet.getDouble("discontCard.acumulation"));
    }


    @Override
    public DiscontCard getDiscontCard() {
        return discontCard;
    }
}
