package com.martin.lemonblog.entity;

import java.util.Date;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * (Article)表实体类
 *
 * @author makejava
 * @since 2021-09-26 23:27:29
 */
@SuppressWarnings("serial")
public class Article extends Model<Article> {
    //文章ID
    private Integer articleId;
    //文章标题
    private String articleTitle;
    //文章所属的用户ID
    private Integer userId;
    //修改日期
    private Date modifyDate;
    //文章地址
    private String articleAddress;
    //赞同数
    private Integer likeNum;
    //评论数
    private Integer commentNum;
    //浏览量
    private Integer lookNum;
    //类别ID
    private Integer categoryId;


    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getArticleAddress() {
        return articleAddress;
    }

    public void setArticleAddress(String articleAddress) {
        this.articleAddress = articleAddress;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getLookNum() {
        return lookNum;
    }

    public void setLookNum(Integer lookNum) {
        this.lookNum = lookNum;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.articleId;
    }
}

