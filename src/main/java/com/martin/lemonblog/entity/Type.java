package com.martin.lemonblog.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (Type)表实体类
 *
 * @author makejava
 * @since 2021-09-26 23:27:29
 */
@SuppressWarnings("serial")
public class Type extends Model<Type> {
    //类型ID
    private Integer typeId;
    //类型名称(原创、转载、翻译)
    private String typeName;


    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.typeId;
    }
    }

