package command.impl.user;


import command.impl.Command;
import constant.ConfigsConstant;
import constant.MessageConstants;
import constant.PagePath;
import constant.Parameters;
import manager.impl.ConfigurationManager;
import manager.impl.MessageManager;
import service.UserService;
import service.exception.ServiceException;
import service.impl.ServiceFactory;
import utils.UserBuilder;
import utils.impl.UserBuilderByRequestParametr;
import validator.impl.UserValidator;

import javax.servlet.http.HttpServletRequest;

public class RegistrationCommand implements Command {
    @Override
    public String execute(HttpServletRequest req) {
        String page = null;
        try {
            ServiceFactory serviceFactory = ServiceFactory.getInstance();

            UserService userService = serviceFactory.getUserService();

            UserBuilder userBuilder = new UserBuilderByRequestParametr(req);
            userBuilder.createUser();
            userBuilder.buildUser();
            userService.registrate(userBuilder.getUser());


            if (UserValidator.getInstance().validateUser(userBuilder.getUser())) {
                if (userService.isNewUser(userBuilder.getUser())) {
                    userService.registrate(userBuilder.getUser());
                    page = ConfigurationManager.getInstance().getProperty(ConfigsConstant.REGISTRATION_PAGE_PATH);
                    req.setAttribute(Parameters.OPERATION_MESSAGE, MessageManager.getInstance().
                            getProperty(MessageConstants.SUCCESS_OPERATION));
                } else {
                    page = ConfigurationManager.getInstance().getProperty(ConfigsConstant.REGISTRATION_PAGE_PATH);
                    req.setAttribute(Parameters.ERROR_USER_EXSISTS, MessageManager.getInstance().
                            getProperty(MessageConstants.USER_EXISTS));
                }
            } else {
                req.setAttribute(Parameters.OPERATION_MESSAGE, MessageManager.getInstance().
                        getProperty(MessageConstants.EMPTY_FIELDS));
                page = ConfigurationManager.getInstance().getProperty(PagePath.REGISTRATION_PAGE_PATH);

            }
        } catch (ServiceException e) {
            page = ConfigurationManager.getInstance().getProperty(PagePath.ERROR_PAGE_PATH);
            req.setAttribute(Parameters.ERROR_DATABASE, MessageManager.getInstance().getProperty(MessageConstants.ERROR_DATABASE));
        } catch (NullPointerException e) {
            page = ConfigurationManager.getInstance().getProperty(ConfigsConstant.INDEX_PAGE_PATH);
        }

        return page;
    }
}