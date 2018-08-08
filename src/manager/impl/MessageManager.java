package manager.impl;

import constant.ConfigsConstant;
import manager.Manager;

import java.util.ResourceBundle;

public class MessageManager implements Manager {

    private final ResourceBundle bundle = ResourceBundle.getBundle(ConfigsConstant.MESSAGES_SOURCE);
    private final static MessageManager instance = new MessageManager();

    private MessageManager() {
    }

    public String getProperty(String key) {
        return bundle.getString(key);
    }

    public static MessageManager getInstance() {
        return instance;
    }
}
