package com.blog.entity;

import java.io.Serializable;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/18
 * @description：分类实体
 */
public class Category implements Serializable {

    private static final Long serialVersionUID=6687286913317513141L;

    /**
     * id
     */
    private int categoryId;

    /**
     * 分类名
     */
    private String categoryName;

    /**
     * 父类ID
     */
    private int categoryPId;

    /**
     * 描述
     */
    private String categoryDescription;

    public Category() {
    }

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryPId() {
        return categoryPId;
    }

    public void setCategoryPId(int categoryPId) {
        this.categoryPId = categoryPId;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryPId=" + categoryPId +
                ", categoryDescription='" + categoryDescription + '\'' +
                '}';
    }

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public static Category Default(){
        return new Category(1000000,"未分类");

    }
}
