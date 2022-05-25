package com.bayembacke.boutique.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException (String message) {
        super(message);
    }
}