package validator.impl;

import entity.Product;
import entity.User;
import validator.Validator;

public class UserValidator extends Validator {
    private final static UserValidator instance = new UserValidator();

    private final static String LOGIN_REGEX = "([A-Za-zА-Яа-я])([a-zа-я]+)";
    private final static String PASSWORD_REGEX = "([A-Za-zА-Яа-я])([a-zа-я]+)";
    private final static String FIRST_NAME_REGEX = "([A-Za-zА-Яа-я])([a-zа-я]+)";
    private final static String LAST_NAME_REGEX = "([A-Za-zА-Яа-я])([a-zа-я]+)";


    private UserValidator() {
    }

    public boolean validateUser(User user) {
        return checkParameter(user.getLogin(), LOGIN_REGEX) && checkParameter(user.getPassword(), PASSWORD_REGEX) &&
                checkParameter(user.getName(), FIRST_NAME_REGEX) && checkParameter(user.getSurname(), LAST_NAME_REGEX);
    }

    public static UserValidator getInstance() {
        return instance;
    }
}
