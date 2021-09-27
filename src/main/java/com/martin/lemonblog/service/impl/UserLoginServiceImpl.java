package com.martin.lemonblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.martin.lemonblog.entity.UserLogin;
import com.martin.lemonblog.mapper.UserLoginMapper;
import com.martin.lemonblog.service.UserLoginService;
import org.springframework.stereotype.Service;

/**
 * (UserLogin)表服务实现类
 *
 * @author makejava
 * @since 2021-09-27 09:44:20
 */
@Service("userLoginService")
public class UserLoginServiceImpl extends ServiceImpl<UserLoginMapper, UserLogin> implements UserLoginService {

}

