package com.practice.springboot.learningspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Data2 data2;
    public String calculateSomething(){

        // Business Logic
        return data2.retrieveSomething();
    }
}
