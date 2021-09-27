package com.martin.lemonblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.martin.lemonblog.entity.ArticleTag;
import com.martin.lemonblog.mapper.ArticleTagMapper;
import com.martin.lemonblog.service.ArticleTagService;
import org.springframework.stereotype.Service;

/**
 * (ArticleTag)表服务实现类
 *
 * @author makejava
 * @since 2021-09-27 09:44:14
 */
@Service("articleTagService")
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag> implements ArticleTagService {

}

