package dao;


import entity.DiscontCard;
import dao.exeption.DAOException;

public interface DiscontCardDAO {

    boolean add(String loginUser, String passwordUser) throws DAOException;

    DiscontCard getByUser(String loginUser, String passwordUser) throws DAOException;

    boolean accumulate(Double summaryPrice, String loginUSer, String passwordUser) throws DAOException;

    boolean updateFromOriginal(String loginUser, String passwordUser) throws DAOException;
}
