package com.nju.idworker.service;

/**
 * Created by XXT on 2019/9/14.
 */
public interface IdService {
    /**
     * 获取分布式全局唯一ID
     * @return
     */
    public long getId();
}
