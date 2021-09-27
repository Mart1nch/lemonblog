package com.martin.lemonblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.martin.lemonblog.entity.ResourceRole;
import com.martin.lemonblog.mapper.ResourceRoleMapper;
import com.martin.lemonblog.service.ResourceRoleService;
import org.springframework.stereotype.Service;

/**
 * (ResourceRole)表服务实现类
 *
 * @author makejava
 * @since 2021-09-27 09:44:17
 */
@Service("resourceRoleService")
public class ResourceRoleServiceImpl extends ServiceImpl<ResourceRoleMapper, ResourceRole> implements ResourceRoleService {

}

