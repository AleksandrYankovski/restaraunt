package dao;


import entity.User;
import dao.exeption.DAOException;

public interface UserDAO {

    boolean add(User user) throws DAOException;
}
