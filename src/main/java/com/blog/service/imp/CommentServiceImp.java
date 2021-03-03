package com.blog.service.imp;

import com.blog.dao.CommentMapper;
import com.blog.entity.Comment;
import com.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/20
 * @description：评论service层接口实现类
 */
@Service
public class CommentServiceImp implements CommentService {

    @Autowired
    CommentMapper commentMapper;

    @Override
    public List<Comment> getRecentComment(int limit) {
        // TODO
        return commentMapper.selectRecentComment(limit);
    }
}
