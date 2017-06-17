package com.vertex.spring.springdemo.controllers;

import com.vertex.spring.springdemo.logic.SearchLogic;
import com.vertex.spring.springdemo.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class SearchController {

    @Autowired
    private SearchLogic searchLogic;

    @PostMapping("/search")
    public String search(@RequestParam("keyword") String keyword, Model model){
        model.addAttribute("keyword", keyword);
        model.addAttribute("result", searchLogic.getSearchResult(keyword));
        return "searchResult";
    }
}
