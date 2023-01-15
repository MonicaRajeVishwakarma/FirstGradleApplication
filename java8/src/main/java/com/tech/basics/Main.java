package com.tech.basics;

import lombok.extern.slf4j.Slf4j;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person();
        person.helloWorld();
        System.out.println("Current Directory = " + System.getProperty("user.dir"));
        //SpringApplication.run(ExampleMain.class, args);
        //logger.info("just a test info log");
    }

}