package com.wind.auth.model;

import com.wind.model.BaseObject;

import java.time.Instant;
import java.util.Date;

/**
 * Menu 菜单
 *
 * @author qianchun 17/11/6
 **/
public class Menu extends BaseObject {

    /**
     * 主键ID
     */
    private long id;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单状态 1:启用 0:停用
     */
    private int status;

    /**
     * 所属应用ID
     */
    private long appId;

    /**
     * 访问地址
     */
    private String url;

    /**
     * 创建时间
     */
    private Instant createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 上一级ID 根目录0
     */
    private long parentId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }
}
