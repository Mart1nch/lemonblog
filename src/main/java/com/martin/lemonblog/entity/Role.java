package com.martin.lemonblog.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (Role)表实体类
 *
 * @author makejava
 * @since 2021-09-26 23:27:29
 */
@SuppressWarnings("serial")
public class Role extends Model<Role> {
    //角色ID
    private Integer roleId;
    //角色名称
    private String roleName;
    //细节信息补充
    private String roleDetail;
    //角色状态(1为可用，0为不可用)
    private Integer roleState;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDetail() {
        return roleDetail;
    }

    public void setRoleDetail(String roleDetail) {
        this.roleDetail = roleDetail;
    }

    public Integer getRoleState() {
        return roleState;
    }

    public void setRoleState(Integer roleState) {
        this.roleState = roleState;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.roleId;
    }
    }

