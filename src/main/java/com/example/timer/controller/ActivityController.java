package com.example.timer.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.timer.Utils.Result;
import com.example.timer.bean.Activity;
import com.example.timer.service.ActivityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/activity")
public class ActivityController {
    @Resource
    private ActivityService activityService;
    @PostMapping("/addactivity")
    public Result addactivity(@RequestBody Activity activity){
        activityService.save(activity);
        return Result.ok();
    }
    @GetMapping("/initactivities")
    public Result initactivities(@RequestParam int userId){
        QueryWrapper<Activity> activityQueryWrapper = new QueryWrapper<>();
        activityQueryWrapper.eq("UserId",userId);
        List<Activity> activityList = activityService.list(activityQueryWrapper);
        return Result.ok().data(activityList);
    }
}
