package com.martin.lemonblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.martin.lemonblog.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * (UserRole)表数据库访问层
 *
 * @author makejava
 * @since 2021-09-26 23:27:30
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

}

