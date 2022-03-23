package com.example.bootsplit.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.bootsplit.entity.User;
import com.example.bootsplit.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lintianxing
 * @since 2022-03-15
 */
@RestController
@RequestMapping("/system/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping()
    public Page<User> get(@RequestBody User user){
        return (Page<User>) userService.selectUserPage(user);
    }
}
