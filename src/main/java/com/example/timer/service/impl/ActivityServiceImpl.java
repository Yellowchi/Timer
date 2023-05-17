package com.example.timer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.timer.bean.Activity;
import com.example.timer.service.ActivityService;
import com.example.timer.mapper.ActivityMapper;
import org.springframework.stereotype.Service;

/**
* @author hs
* @description 针对表【Activity】的数据库操作Service实现
* @createDate 2023-05-17 20:04:41
*/
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity>
    implements ActivityService{

}




