package com.vertex.spring.springdemo.persistence;

import com.vertex.spring.springdemo.model.Result;

import java.net.ConnectException;
import java.util.List;
import java.util.Optional;


public interface SearchPersistence {

    Optional<List<Result>> getResults(String keyword) throws ConnectException;
}
