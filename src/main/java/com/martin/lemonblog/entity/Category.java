package com.martin.lemonblog.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (Category)表实体类
 *
 * @author makejava
 * @since 2021-09-26 23:27:29
 */
@SuppressWarnings("serial")
public class Category extends Model<Category> {
    //类别ID
    private Integer categoryId;
    //类别名称
    private String categoryName;
    //细节信息补充
    private String categoryDetail;
    //父类别ID
    private Integer parentId;


    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDetail() {
        return categoryDetail;
    }

    public void setCategoryDetail(String categoryDetail) {
        this.categoryDetail = categoryDetail;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.categoryId;
    }
    }

