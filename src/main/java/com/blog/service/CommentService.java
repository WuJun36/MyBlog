package com.blog.service;

import com.blog.entity.Comment;

import java.util.List;

public interface CommentService {

    /**
     * 获取最近的评论
     * @param limit 取前多少个
     * @return 评论列表
     */
    List<Comment> getRecentComment(int limit);
}
