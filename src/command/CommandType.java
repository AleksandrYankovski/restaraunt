package command;


import command.impl.Command;
import command.impl.admin.*;
import command.impl.client.*;
import command.impl.user.*;

public enum CommandType {

    ADMIN_1(new ProcessOrderCommand()),
    ADMIN_2(new ShowStatisticsCommand()),
    ADMIN_4(new AddProductCommand()),
    ADMIN_5(new DeleteProductCommand()),
    ADMIN_6(new UpdateProductCommand()),
    ADMIN_7(new SetStockOnProductCommand()),

    CLIENT_1(new LeaveReplyCommand()),
    CLIENT_2(new ShowInformationAboutPreviosOrdersCommand()),
    CLIENT_3(new СheckoutCommand()),
    CLIENT_4(new AddProductToBasketCommand()),
    CLIENT_5(new DeleteProductInBasketCommand()),
    CLIENT_6(new CreateOrderCommand()),

    //    user commands
    SHOWMENUPRODUCT(new ShowMenuProductCommand()),
    SEARCHMENUPRODUCT(new SearchProductCommand()),
    REGISTRATION(new RegistrationCommand()),
    GOTOREGISTRATION(new GoToRegistrationCommand()),
    LOGIN(new LoginCommand()),
    LOGOUT(new LogoutCommand());

    private Command command;

    CommandType(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }
}
