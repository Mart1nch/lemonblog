package com.martin.lemonblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.martin.lemonblog.entity.Category;
import com.martin.lemonblog.mapper.CategoryMapper;
import com.martin.lemonblog.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * (Category)表服务实现类
 *
 * @author makejava
 * @since 2021-09-27 09:44:15
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}

