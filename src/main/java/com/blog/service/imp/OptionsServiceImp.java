package com.blog.service.imp;

import com.blog.dao.OptionsMapper;
import com.blog.entity.Options;
import com.blog.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/18
 * @description：网站基本信息Service层实现类
 */
@Service
public class OptionsServiceImp implements OptionsService {

    @Autowired
    OptionsMapper optionsMapper;

    @Override
    public Options getOptions() {
        return optionsMapper.getOptions();
    }
}
