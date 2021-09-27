package com.martin.lemonblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.martin.lemonblog.entity.Type;
import com.martin.lemonblog.mapper.TypeMapper;
import com.martin.lemonblog.service.TypeService;
import org.springframework.stereotype.Service;

/**
 * (Type)表服务实现类
 *
 * @author makejava
 * @since 2021-09-27 09:44:18
 */
@Service("typeService")
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

}

