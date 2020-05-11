package com.vtf.test.controller;

import java.util.*;
import com.vtf.test.entity.Users;
import com.vtf.test.servies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: Log
 * @ClassName: UserController
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-05-11 14:52
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "findUsers",method = RequestMethod.POST)
    public List<Users> findUsers(){
        return userService.findUsers();
    }

}

