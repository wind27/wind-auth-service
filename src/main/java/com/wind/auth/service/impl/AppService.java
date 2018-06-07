package com.wind.auth.service.impl;

import com.wind.auth.mapper.AppMapper;
import com.wind.auth.model.App;
import com.wind.auth.service.IAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * AppService
 *
 * @author qianchun 17/9/18
 **/
@Service
public class AppService implements IAppService {

    @Autowired
    private AppMapper appMapper;
    @Override
    public boolean save(App app) {
        return appMapper.insert(app)>0;
    }

    @Override
    public App findById(long id) {
        return appMapper.selectByPrimaryKey(id);
    }
}
