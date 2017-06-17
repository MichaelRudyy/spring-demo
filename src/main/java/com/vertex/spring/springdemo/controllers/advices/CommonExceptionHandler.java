package com.vertex.spring.springdemo.controllers.advices;

import com.vertex.spring.springdemo.exceptions.InternalServerException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.IOException;

@ControllerAdvice
public class CommonExceptionHandler {

    @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR, reason="Database connection is lost")
    @ExceptionHandler(InternalServerException.class)
    public String  handleServerException(Model model, InternalServerException e){
        model.addAttribute("message", e.getCause().getMessage());
        return "error";
    }
}
