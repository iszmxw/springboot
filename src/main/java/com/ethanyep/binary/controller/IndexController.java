package com.ethanyep.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @RequestMapping(
            value = {"/index"},
            method = {RequestMethod.GET}
    )
    public String index(String username,String password){
        System.out.println("12121");
        System.out.println("12121");
        System.out.println("12121");
        return "index"+"username："+username+"password："+password;
    }
}
