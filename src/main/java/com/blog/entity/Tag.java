package com.blog.entity;

import java.io.Serializable;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/19
 * @description：标签实体
 */
public class Tag implements Serializable {

    private static final Long serialVersionUID = 605449151900057035L;

    /**
     * 标签id
     */
    private Integer tagId;

    /**
     * 标签名
     */
    private String tagName;

    /**
     * 标签描述
     */
    private String tagDescription;

    public Tag() {
    }

    public Tag(Integer tagId, String tagName, String tagDescription) {
        this.tagId = tagId;
        this.tagName = tagName;
        this.tagDescription = tagDescription;
    }

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagDescription() {
        return tagDescription;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagId=" + tagId +
                ", tagName='" + tagName + '\'' +
                ", tagDescription='" + tagDescription + '\'' +
                '}';
    }
}
