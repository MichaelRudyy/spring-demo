package com.vertex.spring.springdemo.exceptions;


public class InternalServerException extends RuntimeException {

    public InternalServerException(Throwable throwable){
        super(throwable);
    }

}
