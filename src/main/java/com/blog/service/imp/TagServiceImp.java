package com.blog.service.imp;

import com.blog.dao.TagMapper;
import com.blog.entity.Tag;
import com.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/19
 * @description：标签Service层实现类
 */
@Service
public class TagServiceImp implements TagService {

    @Autowired
    TagMapper tagMapper;

    @Override
    public int countTags() {
        return tagMapper.countTags();
    }

    @Override
    public List<Tag> getAllTags() {
        return tagMapper.selectAllTags();
    }

    @Override
    public Tag getTagById(Integer tagId) {
        return tagMapper.getTagById(tagId);
    }
}
