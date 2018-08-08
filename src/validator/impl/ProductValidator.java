package validator.impl;


import entity.Product;
import validator.Validator;

public class ProductValidator extends Validator {

    private final static ProductValidator instance = new ProductValidator();


    private ProductValidator() {
    }


    public boolean validateProduct(Product product) {
        return true;
    }

    public static ProductValidator getInstance() {
        return instance;
    }
}
