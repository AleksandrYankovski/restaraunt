package command.impl.user;


import command.impl.Command;
import entity.Product;
import service.UserService;
import service.exception.ServiceException;
import service.impl.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class ShowMenuProductCommand implements Command {
    @Override
    public String execute(HttpServletRequest req) {
        try {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            UserService userService = serviceFactory.getUserService();
            List<Product> products = userService.getProducts();
            products.forEach(System.out::println);
        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}

