package command.impl.user;


import command.impl.Command;
import constant.ConfigsConstant;
import manager.impl.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

public class LoginCommand implements Command {
    @Override
    public String execute(HttpServletRequest req) {

        String page = ConfigurationManager.getInstance().getProperty(ConfigsConstant.CONFIGS_SOURCE);
        return page;

    }
}
