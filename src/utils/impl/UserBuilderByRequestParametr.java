package utils.impl;

import constant.Parameters;
import entity.*;
import utils.*;


import javax.servlet.ServletRequest;

public class UserBuilderByRequestParametr implements UserBuilder {

    private ServletRequest request;
    private User user;

    public UserBuilderByRequestParametr(ServletRequest request) {
        this.request = request;
    }


    @Override
    public void createUser() {
        user = new User();
    }

    @Override
    public void buildUser() {
        user.setLogin(request.getParameter(Parameters.LOGIN));
        user.setPassword(request.getParameter(Parameters.PASSWORD));
        user.setName(request.getParameter(Parameters.FIRST_NAME));
        user.setSurname(request.getParameter(Parameters.LAST_NAME));
    }

    @Override
    public User getUser() {
        return user;
    }
}
