package service.impl;

import dao.connection.ConnectorDB;
import service.AdminService;
import service.ClientService;
import service.UserService;

import java.sql.Connection;

public final class ServiceFactory {

    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private ClientService clientService = new ClientServiceImpl();
    private AdminService adminService = new AdminServiceImpl();
    private UserService userService = new UserServiceImpl();


    public ClientService getClientService() {
        return clientService;
    }

    public AdminService getAdminService() {
        return adminService;
    }

    public UserService getUserService() {
        return userService;
    }

    public static ServiceFactory getInstance() {
        return INSTANCE;
    }


    private ServiceFactory() {
    }
}
