package com.example.timer.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.timer.Utils.Result;
import com.example.timer.bean.Action;
import com.example.timer.service.ActionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/action")
public class ActionController {
    @Resource
    private ActionService actionService;
    @GetMapping("/initactions")
    public Result initactions(@RequestParam int userId){
        QueryWrapper<Action> actionQueryWrapper = new QueryWrapper<Action>();
        actionQueryWrapper.eq("UserId",0).or().eq("UserId",userId);
        List<Action> list = actionService.list(actionQueryWrapper);
        return Result.ok().data(list);
    }
}
