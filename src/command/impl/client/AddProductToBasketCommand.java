package command.impl.client;


import command.impl.Command;
import service.ClientService;
import service.exception.ServiceException;
import service.impl.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddProductToBasketCommand implements Command {
    @Override
    public String execute(HttpServletRequest req) {
        Scanner scanner = new Scanner(System.in);

        try {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();

            ClientService clientService = serviceFactory.getClientService();


            System.out.println("введите id заказа");
            Integer idOrder = scanner.nextInt();


            System.out.println("введите id продукта");
            Integer idProduct = scanner.nextInt();


            boolean answer = clientService.addProductToBasket(idOrder, idProduct);

            if (answer)
                System.out.println("product successfully added to basket");
            else
                System.out.println("product can't added to basket");


        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("incorect type input");
        }

        return null;
    }
}
