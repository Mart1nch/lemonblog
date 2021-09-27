package com.martin.lemonblog.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (UserRole)表实体类
 *
 * @author makejava
 * @since 2021-09-26 23:27:30
 */
@SuppressWarnings("serial")
public class UserRole extends Model<UserRole> {
    //无意义ID
    private Integer id;
    //用户ID
    private Integer userId;
    //角色ID
    private Integer roleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.id;
    }
    }

