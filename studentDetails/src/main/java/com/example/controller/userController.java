package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.user;

@RestController
public class userController {
    @GetMapping("/users")
    public user getUser(    @RequestParam(value = "first_name",defaultValue = "kishor")String firstname,
                            @RequestParam(value ="last_name",defaultValue = "A B")String lastname,
                            @RequestParam(value = "age",defaultValue = "23")int age){
        user user=new user();
        user.setFirst_name(firstname);
        user.setLast_Name(lastname);
        user.setAge(age);
        return user;

    }
    @PostMapping("/users")
    public String postUsers(user user){
        System.out.println("user firstname :"+user.getFirst_name());
        return "user";
    }

}
