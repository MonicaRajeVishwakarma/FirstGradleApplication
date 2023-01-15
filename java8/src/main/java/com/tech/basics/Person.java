package com.tech.basics;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Person {

    private final Logger log = LoggerFactory.getLogger(Person.class);
    private Name personName;
    private static int personCounter;

    public Person(Name personName){
        this.personName = personName;
    }

    public Person(){
        this.personCounter++;
        /*
        Empty on purpose, default constructor
         */
    }
    public String helloWorld() {
        System.out.println("In helloworld");
        log.info("This is info {}");
        log.warn("This is warn {}");
        log.debug("This is debug {}");
        log.error("This is error {}");
        log.info("This is info again {}");
        return "Hello World";
    }

    public String helloName(String name) {
        return "Hello "+name;
    }

    public static int numberOfObjects() {
        return personCounter;
    }

    public String switchExample() {
        States states = States.PROCESSED;
        String string = "New" ;
        switch (string){
            case "New" -> string="Latest";
            case "" -> string = "null";
        }

        return switch (states){
            case PENDING -> "its pending";
            case PROCESSING -> "null";
            case PROCESSED -> "null ";
        };
    }
}
