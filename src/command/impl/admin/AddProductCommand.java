package command.impl.admin;


import command.impl.Command;
import entity.Product;
import service.exception.ServiceException;
import service.AdminService;
import service.impl.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddProductCommand implements Command {
    @Override
    public String execute(HttpServletRequest req) {
        Scanner scanner = new Scanner(System.in);
        try {

            ServiceFactory serviceFactory = ServiceFactory.getInstance();

            AdminService adminService = serviceFactory.getAdminService();

            Product product = new Product();

            System.out.println("введите имя продукта");
            product.setName(scanner.nextLine());

            System.out.println("введите тип продукта");
            product.setTypeProduct(scanner.nextLine());

            System.out.println("установите количество жиров");
            product.setFat(scanner.nextInt());

            System.out.println("установите количество протеина");
            product.setProteint(scanner.nextInt());

            System.out.println("установите количество протеина");
            product.setCarbohydrates(scanner.nextInt());

            System.out.println("установите цену продукта");
            product.setPrice(scanner.nextInt());

            System.out.println("если продукт является новинкой введите true");
            product.setNovelty(scanner.nextBoolean());

            System.out.println("установите скидку на товар");
            product.setDiscont(scanner.nextInt());

            adminService.addProduct(product);
        } catch (ServiceException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("incorect type input");
        }
        return null;
    }
}
