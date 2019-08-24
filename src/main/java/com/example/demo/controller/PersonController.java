package com.example.demo.controller;


import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/persons")
public class PersonController {

        @Autowired
       private PersonService ps ;

        @RequestMapping("{id}")
        public Person getPerson(@PathVariable String id)
        {
            return ps.getPerson(id);
        }
        @RequestMapping("/all")
        public HashMap<String, Person> getAll(){
            return ps.getAll();
        }
}
