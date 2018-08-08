package dao;


import dao.exeption.DAOException;

public interface OrderToProductDAO {

    public boolean add(Integer idOrder, Integer idProduct) throws DAOException;
}
