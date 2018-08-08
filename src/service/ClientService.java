package service;


import entity.Order;
import service.exception.ServiceException;

import java.util.List;

public interface ClientService {

    boolean createOrder(String loginUser, String passwordUser) throws ServiceException;

    //Order getLastOrder(String loginUser, String passwordUser) throws ServiceException;

    boolean addProductToBasket(Integer idOrder, Integer idProduct) throws ServiceException;

    List<Order> getOrders(String loginUser, String passwordUser) throws ServiceException;

    List<Order> getOrders() throws ServiceException;

    boolean checkout(String loginUSer, String passwordUser, Integer idOrder,
                     Boolean accumulate) throws ServiceException;

}
