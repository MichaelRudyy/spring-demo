package com.vertex.spring.springdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {
    private String url;
    private String title;
    private String textSample;
}
