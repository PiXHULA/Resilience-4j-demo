package com.joakimonnhage.resilience4jdemo.exception;

public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }
}
