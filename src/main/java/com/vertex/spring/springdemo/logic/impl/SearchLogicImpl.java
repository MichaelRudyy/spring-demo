package com.vertex.spring.springdemo.logic.impl;

import com.vertex.spring.springdemo.exceptions.InternalServerException;
import com.vertex.spring.springdemo.logic.SearchLogic;
import com.vertex.spring.springdemo.model.Result;
import com.vertex.spring.springdemo.persistence.SearchPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.net.ConnectException;
import java.rmi.ServerException;
import java.util.*;


@Service
@Qualifier("searchLogic")
public class SearchLogicImpl implements SearchLogic {

    private static final ArrayList<Result> EMPTY_LIST = new ArrayList<>();

    private final SearchPersistence searchPersistence;

    @Autowired
    public SearchLogicImpl(SearchPersistence searchPersistence) {
        this.searchPersistence = searchPersistence;
    }

    @Override
    public List<Result> getSearchResult(String keyword) {
        try {
            return searchPersistence.getResults(keyword).orElse(EMPTY_LIST);
        } catch (ConnectException e) {
            throw new InternalServerException(e);
        }
    }
}
