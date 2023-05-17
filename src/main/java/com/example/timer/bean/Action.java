package com.example.timer.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName Action
 */
@TableName(value ="Action")
@Data
public class Action implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer actionid;

    /**
     * 时间名称
     */
    private String actionname;

    /**
     * 用户
     */
    private Integer userid;

    /**
     * 背景颜色
     */
    private String color;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}