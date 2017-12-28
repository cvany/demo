package com.vany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by van元 on 2017/12/27.
 */
@Controller
public class HelloController1 {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("users")
    @ResponseBody
    public List<User> usersList(){
        return userRepository.findAll();
    }

    @RequestMapping("hi")
    public String jump(){
        return "index.html";
    }

}
