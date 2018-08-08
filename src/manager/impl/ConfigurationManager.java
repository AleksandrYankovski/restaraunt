package manager.impl;

import constant.ConfigsConstant;
import manager.Manager;

import java.util.ResourceBundle;

public class ConfigurationManager implements Manager {
    private final static ConfigurationManager instance = new ConfigurationManager();
    private final ResourceBundle bundle = ResourceBundle.getBundle(ConfigsConstant.CONFIGS_SOURCE);


    private ConfigurationManager() {
    }

    @Override
    public String getProperty(String key) {
        return bundle.getString(key);
    }

    public static ConfigurationManager getInstance() {
        return instance;
    }
}
