package com.feignclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.feignclient.service.UserService;

@RestController
public class UserController {
	    @Autowired
	    private UserService service;

	    @RequestMapping(value = "/getUserByname")
	    public String getUserByname(@RequestParam String name){
	        return service.getUserByName(name);
	    }
}
