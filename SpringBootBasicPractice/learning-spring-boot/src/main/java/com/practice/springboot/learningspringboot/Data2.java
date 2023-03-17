package com.practice.springboot.learningspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Data2 {
    public  String retrieveSomething(){
        return "Dao2";
    }
}
