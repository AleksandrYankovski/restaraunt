package dao.impl;


import dao.UserDAO;
import dao.connection.ConnectorDB;
import entity.User;
import dao.exeption.DAOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAOImpl implements UserDAO {

    private static final String ADD_USER = "INSERT INTO users (login,password,name,surname,phoneNumber,role) values(?,?,?,?,?,?)";


    public UserDAOImpl() {
    }

    @Override
    public boolean add(User user) throws DAOException {

        return false;

    }
}
