package com.martin.lemonblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.martin.lemonblog.entity.Tag;
import com.martin.lemonblog.mapper.TagMapper;
import com.martin.lemonblog.service.TagService;
import org.springframework.stereotype.Service;

/**
 * (Tag)表服务实现类
 *
 * @author makejava
 * @since 2021-09-27 09:44:17
 */
@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}

