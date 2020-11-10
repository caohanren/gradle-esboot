package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/test1")
    public String test1(){
        return "hello gradle....";
    }

    public static void main(String[] args) {
        System.out.println("开始gradle旅程...");
    }

}
