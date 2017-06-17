package com.vertex.spring.springdemo.logic;


import com.vertex.spring.springdemo.model.Result;

import java.util.List;

public interface SearchLogic {

    List<Result> getSearchResult(String keyword);

}
