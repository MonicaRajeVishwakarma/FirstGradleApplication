package com.tech.basics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void test1_shouldReturnHelloWorld(){
        Person person = new Person();
        assertEquals("Hello World",person.helloWorld());
    }

    @Test
    public void test2_shouldReturnHelloName(){
        Person person = new Person();
        assertEquals("Hello Monica",person.helloName("Monica"));
    }

    @Test
    public void test3_shouldReturnNumberofPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        assertEquals(4,Person.numberOfObjects());
    }

    @Test
    public void test4_shouldReturnEnumValue(){
        assertEquals("PROCESSED",States.PROCESSED.toString());
    }

    @Test
    public void test5_shouldReturnSwitchResult(){
        Person person = new Person();
        assertEquals("Latest",person.switchExample());
    }
}
