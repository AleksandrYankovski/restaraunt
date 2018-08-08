package dao.impl;

import entity.*;
import dao.DiscontCardDAO;
import dao.connection.ConnectorDB;
import dao.exeption.DAOException;
import utils.impl.DiscontCardBuilderByDB;
import utils.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DiscontCardDAOImpl implements DiscontCardDAO {


    private final static String ADD_DISCONT_CARD = "INSERT INTO discontCard (users_login,users_password)" +
            " VALUES(?,?)";
    private final static String ACUMULATE = "UPDATE discontCard SET acumulation=acumulation+0.05*? " +
            " WHERE users_login=? && users_password=?";
    private final static String UPDATE_FROM_ORIGINAL = "UPDATE discontCard SET acumulation=0 " +
            " WHERE users_login=? && users_password=?";
    private final static String GET_BY_USER = "SELECT * FROM discontCard " +
            "WHERE users_login=? && users_password=? ";

    @Override
    public boolean add(String loginUser, String passwordUser) throws DAOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public DiscontCard getByUser(String loginUser, String passwordUser) throws DAOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean accumulate(Double summaryPrice, String loginUSer, String passwordUser) throws DAOException {

        throw new UnsupportedOperationException();
    }

    @Override
    public boolean updateFromOriginal(String userLogin, String userPassword) throws DAOException {
        throw new UnsupportedOperationException();
    }
}
