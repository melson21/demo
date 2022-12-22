package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class User {
    private ArrayList<String> users;

    @GetMapping("/users")
    public void Users(){
        System.out.println(users);
    }
    @GetMapping("/userbyID")
    public void UsersById(){
        System.out.println(new ArrayList<>());
    }
    @GetMapping("/usersOrganization")
    public void usersOrganization(){
        System.out.println(new ArrayList<>());
    }
    @GetMapping("/organizations")
    public void organizations(){
        System.out.println(new ArrayList<>());
    }
}