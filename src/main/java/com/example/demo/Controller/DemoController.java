package com.example.demo.Controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("getUser")
    public Map getUser(){
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();

        List<User> users = userService.getUsers();

        stringObjectHashMap.put("code",0);
        stringObjectHashMap.put("msg","");
        stringObjectHashMap.put("count",users.size());
        stringObjectHashMap.put("data",users);

        return  stringObjectHashMap;
    }

}
