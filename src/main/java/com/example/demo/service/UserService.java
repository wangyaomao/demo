package com.example.demo.service;

import com.example.demo.bean.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {

        ArrayList<User> users = new ArrayList<>();
       for (int i = 0 ; i < 30 ; i ++){
           users.add(new User(i + "" ,i + "",i + "",i + "",i + "",i + "",i + "",i + "",i + ""));
       }

    return users;
    }
}
