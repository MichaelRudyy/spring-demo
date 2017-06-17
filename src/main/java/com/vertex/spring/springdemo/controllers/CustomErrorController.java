package com.vertex.spring.springdemo.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomErrorController
//        implements ErrorController
{

//    private static final String PATH = "/error";
//
//    @PostMapping(PATH)
//    public String handleError(ModelAndView model){
//        model.getModel().keySet().forEach(System.out::println);
//
//        return "error";
//    }
//
//    @Override
//    public String getErrorPath() {
//        return PATH;
//    }
}
