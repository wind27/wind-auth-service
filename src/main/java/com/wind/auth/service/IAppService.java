package com.wind.auth.service;



import com.wind.auth.model.App;

/**
 * IAppService app 服务接口
 *
 * @author qianchun 17/9/18
 **/
public interface IAppService {
    /**
     * @param app app
     * @return 返回操作结果
     */
    boolean save(App app);

    /**
     * @param id 主键id
     * @return 返回结果
     */
    App findById(long id);
}

