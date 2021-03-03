package com.blog.service;


import com.blog.entity.Tag;

import java.util.List;

public interface TagService {

    int countTags();

    /**
     * 获取全部的标签
     * @return 标签列表
     */
    List<Tag> getAllTags();

    /**
     * 根据Id获取标签详情
     * @param tagId
     * @return
     */
    Tag getTagById(Integer tagId);
}
