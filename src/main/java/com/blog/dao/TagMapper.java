package com.blog.dao;

import com.blog.entity.Tag;

import java.util.List;

public interface TagMapper {

    /**
     * 计算所有的标签数量
     * @return 标签数
     */
    int countTags();

    /**
     * 查询全部的标签
     * @return 标签列表
     */
    List<Tag> selectAllTags();

    /**
     * 根据标签ID返回标签详细信息
     * @param tagId
     * @return
     */
    Tag getTagById(Integer tagId);
}
