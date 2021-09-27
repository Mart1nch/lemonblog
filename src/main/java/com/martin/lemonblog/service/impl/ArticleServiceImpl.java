package com.martin.lemonblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.martin.lemonblog.mapper.ArticleMapper;
import com.martin.lemonblog.entity.Article;
import com.martin.lemonblog.mapper.ArticleMapper;
import com.martin.lemonblog.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * (Article)表服务实现类
 *
 * @author makejava
 * @since 2021-09-27 09:44:09
 */
@Service("articleService")
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}

