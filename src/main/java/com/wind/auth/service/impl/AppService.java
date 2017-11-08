package com.wind.auth.service.impl;

import com.wind.auth.dao.IAppDao;
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
    private IAppDao appDao;
    @Override
    public App save(App app) {
        return appDao.insert(app);
    }

    @Override
    public App findById(long id) {
        return appDao.findById(id);
    }
}
