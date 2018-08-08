package command.impl.admin;


import command.impl.Command;
import service.AdminService;
import service.exception.ServiceException;
import service.impl.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DeleteProductCommand implements Command {

    @Override
    public String execute(HttpServletRequest req) {

        try {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();

            AdminService adminService = serviceFactory.getAdminService();

            System.out.println("введите id продукта");
            Scanner scanner = new Scanner(System.in);

            Integer id = scanner.nextInt();

            boolean answer = adminService.deleteProduct(id);

            if (answer)
                System.out.println("product successfully deleted");
            else
                System.out.println("the product with the specified id was not found");

        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("incorect type input");
        }
        return null;
    }
}