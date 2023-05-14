package com.example.timer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.timer.bean.User;
import com.example.timer.service.UserService;
import com.example.timer.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author hs
* @description 针对表【User】的数据库操作Service实现
* @createDate 2023-05-14 22:32:17
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




