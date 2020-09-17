package com.itchao.studyjpa.controller;

import com.itchao.studyjpa.POJO.User;
import com.itchao.studyjpa.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;

/**
 * @author Mr.L
 */
@RestController
@RequestMapping(path = "/api/v1")
public class UserController {
    @Autowired
    private UserDao userDao;

    @PostMapping(path = "user",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public User addNewUser(@RequestBody User user) {
        System.out.println(user);
        //URLDecoder.decode(user,"utf-8");
        return userDao.save(user);
    }

    @GetMapping(path = "users")
    @ResponseBody
    public Page<User> getAllUsers(Pageable request) {
        System.out.println("输入的参数:"+request);
        System.out.println(userDao.findAll(request));
        System.out.println("查完了!");
        return userDao.findAll(request);
    }
}
