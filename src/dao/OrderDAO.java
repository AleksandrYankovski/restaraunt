package dao;


import entity.Order;
import dao.exeption.DAOException;

import java.util.List;

public interface OrderDAO {


    boolean create(String loginUser, String passwordUser) throws DAOException;

    Order getLastByIdUser(String loginUser, String passwordUser) throws DAOException;

    boolean update(double value, Integer id) throws DAOException;

    boolean update(double value, Integer id, String orderStatus) throws DAOException;

    List<Order> getAll(String loginUser, String passwordUser) throws DAOException;

    List<Order> getAll() throws DAOException;

}
