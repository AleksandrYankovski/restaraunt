package command.impl.user;

import command.impl.Command;
import constant.ConfigsConstant;
import manager.impl.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

public class GoToRegistrationCommand implements Command {

    @Override
    public String execute(HttpServletRequest req) {

        String page = ConfigurationManager.getInstance().getProperty(ConfigsConstant.REGISTRATION_PAGE_PATH);
        return page;

    }
}
