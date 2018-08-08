package command.impl.client;


import command.impl.Command;
import service.ClientService;
import service.exception.ServiceException;
import service.impl.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.Scanner;

public class CreateOrderCommand implements Command {

    @Override
    public String execute(HttpServletRequest req) {
        Scanner scanner = new Scanner(System.in);

        try {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();

            ClientService clientService = serviceFactory.getClientService();

            System.out.println("введите свой login");
            String loginUSer = scanner.nextLine();

            System.out.println("введите свой password");
            String passwordUser = scanner.nextLine();

            boolean answer = clientService.createOrder(loginUSer, passwordUser);

            if (answer)
                System.out.println("order successfully created");
            else
                System.out.println("order can't create");


        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
