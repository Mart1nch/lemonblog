package com.martin.lemonblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.martin.lemonblog.entity.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Article)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-26 23:27:29
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}

