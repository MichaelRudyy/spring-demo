package com.vertex.spring.springdemo.persistence.impl;

import com.vertex.spring.springdemo.model.Result;
import com.vertex.spring.springdemo.persistence.SearchPersistence;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.net.ConnectException;
import java.util.*;
import java.util.stream.Collectors;

@Repository
@Qualifier("searchPersistence")
public class SearchPersistenceImpl implements SearchPersistence {

    Random random = new Random();

    List<Result> results = Arrays.asList(new Result("http://junit.org/junit4/", "JUnit",
            "Junit is the best tool to test your java code"),
            new Result("https://spring.io", "Spring", "Spring is a powerfull framework for you"),
            new Result("http://oracle.com", "Java", "Java is the best, at least better than C#"),
            new Result("http://tomcat.apache.org", "Tomcat", "The Apache Tomcat® software is an open source implementation of the Java Servlet, JavaServer Pages, Java Expression Language and Java WebSocket technologies"));


    @Override
    public Optional<List<Result>> getResults(String keyword) throws ConnectException {

        if(random.nextBoolean()){
            throw new ConnectException("There is no connection to database");
        }

        String lowerKeyword = keyword.toLowerCase();
        return Optional.ofNullable(results.stream()
                .filter(result -> result
                        .getTextSample()
                        .toLowerCase()
                        .contains(lowerKeyword))
                .collect(Collectors.toList()));
    }
}
