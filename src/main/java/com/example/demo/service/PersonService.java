package com.example.demo.service;

import com.example.demo.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    List<Person> mylist = new ArrayList<>();
    public String PersonService(){
        Person p = new Person();
        p.setId("1");
        p.setFirstName("Steve");
        p.setLastName("Jobs");
        p.setAge(50);
        p = new Person();
        p.setId("2");
        p.setFirstName("Bill");
        p.setLastName("William");
        p.setAge(45);

    }




}
