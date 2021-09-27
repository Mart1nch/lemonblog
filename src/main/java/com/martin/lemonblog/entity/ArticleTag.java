package com.martin.lemonblog.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (ArticleTag)表实体类
 *
 * @author makejava
 * @since 2021-09-26 23:27:29
 */
@SuppressWarnings("serial")
public class ArticleTag extends Model<ArticleTag> {
    //无意义ID
    private Integer id;
    //文章ID
    private Integer articleId;
    //标签ID
    private Integer tagId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
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

