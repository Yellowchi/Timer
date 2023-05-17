package com.example.timer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.timer.bean.Action;
import com.example.timer.service.ActionService;
import com.example.timer.mapper.ActionMapper;
import org.springframework.stereotype.Service;

/**
* @author hs
* @description 针对表【Action】的数据库操作Service实现
* @createDate 2023-05-17 19:53:30
*/
@Service
public class ActionServiceImpl extends ServiceImpl<ActionMapper, Action>
    implements ActionService{

}




