package command.impl.admin;


import command.impl.Command;
import entity.Order;
import service.ClientService;
import service.exception.ServiceException;
import service.impl.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Scanner;

public class ShowStatisticsCommand implements Command {

    @Override
    public String execute(HttpServletRequest req) {
        Scanner scanner = new Scanner(System.in);

        try {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();

            ClientService clientService = serviceFactory.getClientService();


            List<Order> orders = clientService.getOrders();
            for (Order order : orders) {
                System.out.println(order.getId() + " " + order.getDate() + " " +
                        order.getTime() + " " + order.getSummaryPrice() + " " + order.getOrderStatus() + " "
                        + order.getUser());
            }

        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
