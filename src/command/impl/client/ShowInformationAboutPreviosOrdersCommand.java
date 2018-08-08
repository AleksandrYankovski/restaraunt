package command.impl.client;


import command.impl.Command;

import javax.servlet.http.HttpServletRequest;

public class ShowInformationAboutPreviosOrdersCommand implements Command {

    @Override
    public String execute(HttpServletRequest req) {
/*
        Scanner scanner = new Scanner(System.in);

        try {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();

            ClientService clientService = serviceFactory.getClientService();

            System.out.println("введите свой login");
            String loginUSer = scanner.nextLine();

            System.out.println("введите свой password");
            String passwordUser = scanner.nextLine();

            List<Order> orders = clientService.getOrders(loginUSer, passwordUser);
            for (Order order : orders) {
                System.out.println(order.getId() + " " + order.getDate() + " " +
                        order.getTime() + " " + order.getSummaryPrice());
            }//посмотреть как это  java8


        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        }
*/

        return null;
    }
}
