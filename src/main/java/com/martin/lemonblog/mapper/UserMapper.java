package com.martin.lemonblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.martin.lemonblog.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-26 23:27:29
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}

