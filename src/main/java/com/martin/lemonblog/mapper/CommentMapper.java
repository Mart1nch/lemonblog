package com.martin.lemonblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.martin.lemonblog.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Comment)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-26 23:27:29
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}

