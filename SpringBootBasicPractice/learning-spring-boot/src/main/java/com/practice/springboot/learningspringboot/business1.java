package com.practice.springboot.learningspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class business1 {

    @Autowired
    private Data1 data1;
    public String calculateSomething(){

        // Business Logic
        return data1.retrieveSomething();
    }
}
