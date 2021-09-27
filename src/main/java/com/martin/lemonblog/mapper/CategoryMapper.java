package com.martin.lemonblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.martin.lemonblog.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Category)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-26 23:27:29
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}

