package com.blog.dao;

import com.blog.entity.Category;

import java.util.List;

public interface CategoryMapper {

    /**
     * 查询全部的分类
     * @return
     */
    List<Category> selectAllCategory();

    /**
     * 查询总的分类数
     * @return 分类数
     */
    Integer countCategory();

    /**
     * 根据id查询分类详情
     * @param id
     * @return
     */
    Category getCategoryById(Integer id);
}
