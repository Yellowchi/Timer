package com.example.timer.Utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result implements Serializable {
    private boolean success;

    private int code;

    private String msg;

    private Map<String, Object> data = new HashMap<>();

    private Object list;

    private long timestamp;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public Object getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    private Result() {
        timestamp = System.currentTimeMillis();
    }

    public static Result ok() {
        Result r = new Result();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMsg("成功");
        return r;
    }

    public static Result error() {
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMsg("失败");
        return r;
    }

    public static Result paserror() {
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMsg("密码错误");
        return r;
    }

    public static Result usererror() {
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMsg("用户不存在");
        return r;
    }

    public Result data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public Result data(Object value){
        this.list = value;
        return this;
    }
    public static Result userexist() {
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMsg("用户已存在");
        return r;
    }

    public static Result emailerror() {
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMsg("邮箱错误");
        return r;
    }

    public static Result histnull() {
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResultCode.HISTNULLERROR);
        r.setMsg("当月没有行程数据");
        return r;
    }

    public static Result allnull() {
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResultCode.ALLNULLERROR);
        r.setMsg("没有行程数据");
        return r;
    }

    public static Result uploadimageok() {
        Result r = new Result();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMsg("图片上传成功");
        return r;
    }

    public static Result suberror(String s){
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResultCode.SUBNULL);
        r.setMsg(s);
        return r;
    }

    public static Result objerror(String s){
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResultCode.OBJNULL);
        r.setMsg(s);
        return r;
    }

    public static Result hasapply() {
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMsg("已申请打回");
        return r;
    }
}
