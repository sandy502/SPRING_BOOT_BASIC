package com.practice.springboot.learningspringboot;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Data1 {

    public  String retrieveSomething(){
        return "Dao1";
    }
}
