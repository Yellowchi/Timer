package com.example.timer.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.timer.Utils.JwtUtils;
import com.example.timer.Utils.Result;
import com.example.timer.bean.User;
import com.example.timer.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Resource
    private UserService userService;
    @PostMapping("/login")
    public Result login(@RequestBody User user){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("username",user.getUsername());
        if (userService.count(userQueryWrapper) == 0){
            return Result.usererror();
        }
        User u = userService.getOne(userQueryWrapper);
        if (!u.getPassword().equals(user.getPassword())){
            return Result.paserror();
        }
        String token = JwtUtils.generateToken(u.getUserid().toString());
        return Result.ok().data("token",token).data("userId",u.getUserid());
    }
    @PostMapping("/register")
    public Result register(@RequestBody User user){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("userId",user.getUserid());
        if (userService.count(userQueryWrapper) > 0){
            return Result.userexist();
        }
        userService.save(user);
        return Result.ok();
    }
    @PostMapping("/edituser")
    public Result edituser(@RequestBody User user){
        userService.updateById(user);
        return Result.ok();
    }
}
