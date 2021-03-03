package com.blog.service.imp;

import com.blog.dao.CategoryMapper;
import com.blog.entity.Category;
import com.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/18
 * @description：分类Service层接口实现类
 */
@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getAllCategory() {

        return categoryMapper.selectAllCategory();
    }

    @Override
    public Integer countCategory() {
        return categoryMapper.countCategory();
    }

    @Override
    public Category getCategoryById(Integer categoryId) {
        return categoryMapper.getCategoryById(categoryId);
    }
}
