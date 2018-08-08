package service;


import entity.*;
import service.exception.ServiceException;

import java.util.List;

public interface UserService {
    List<Product> getProducts() throws ServiceException;

    void registrate(User user) throws ServiceException;

    boolean isNewUser(User user);

}
