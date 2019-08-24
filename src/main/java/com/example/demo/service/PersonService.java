package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PersonService {

    HashMap<String, Person> mylist = new HashMap<>();

    public PersonService()
    {
        Person p = new Person();
        p.setId("1");
        p.setFirstName("Steve");
        p.setLastName("Jobs");
        p.setAge(50);
        mylist.put("1", p);

        p = new Person();
        p.setId("2");
        p.setFirstName("Bill");
        p.setLastName("William");
        p.setAge(45);
        mylist.put("2", p);

    }

    public Person getPerson(String id)
    {
        if(mylist.containsKey(id)) {
            return mylist.get(id);
        }
            else {
            return  null;
        }
    }
    public HashMap<String, Person> getAll(){
        return mylist;
    }



}
