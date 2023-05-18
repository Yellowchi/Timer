package com.example.timer.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName Activity
 */
@TableName(value ="Activity")
@Data
public class Activity implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer activityid;

    /**
     * 
     */
    private Integer actionid;

    /**
     * 
     */
    private Integer userid;

    /**
     * 
     */
    private Date start;

    /**
     * 
     */
    private Date end;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private Date createdate;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}