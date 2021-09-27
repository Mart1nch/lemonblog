package com.martin.lemonblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.martin.lemonblog.entity.Comment;
import com.martin.lemonblog.mapper.CommentMapper;
import com.martin.lemonblog.service.CommentService;
import org.springframework.stereotype.Service;

/**
 * (Comment)表服务实现类
 *
 * @author makejava
 * @since 2021-09-27 09:44:16
 */
@Service("commentService")
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}

