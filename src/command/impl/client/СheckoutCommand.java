package command.impl.client;

import command.impl.Command;
import service.ClientService;
import service.exception.ServiceException;
import service.impl.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.InputMismatchException;
import java.util.Scanner;

public class СheckoutCommand implements Command {

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

            System.out.println("введите id заказа");
            Integer idOrder = scanner.nextInt();

            System.out.println("Накапливать процент на карте.Введите true or false");

            Boolean accumulate = scanner.nextBoolean();

            boolean answer = clientService.checkout(loginUSer, passwordUser, idOrder, accumulate);

            if (answer)
                System.out.println("order successfully paid");
            else
                System.out.println("order don't paid");


        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("incorect type input");
        }

        return null;
    }
}
