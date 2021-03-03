package com.blog.service;

import com.blog.entity.Category;

import java.util.List;

/**
 * 分类Service层接口
 */
public interface CategoryService {

    /**
     * 获取全部分类信息
     * @return 分类List
     */
    List<Category> getAllCategory();

    /**
     * 计算分类的总数量
     * @return 分类总数
     */
    Integer countCategory();

    /**
     * 根据id获取分类详情
     * @param categoryId
     * @return
     */
    Category getCategoryById(Integer categoryId);
}
