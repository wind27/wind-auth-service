package com.wind.auth.service;



import com.wind.auth.model.App;

/**
 * IAppService app 服务接口
 *
 * @author qianchun 17/9/18
 **/
public interface IAppService {
    /**
     * @param app
     * @return
     */
    App save(App app);

    /**
     * @param id
     * @return
     */
    App findById(long id);
}

