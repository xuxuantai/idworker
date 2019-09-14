package com.nju.idworker.service.Impl;


import com.nju.idworker.service.IdService;
import com.nju.idworker.util.IdWorker;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

/**
 * Created by XXT on 2019/9/14.
 */

@Service
public class IdServiceImpl implements IdService {
    /**
     * 获取分布式全局唯一ID
     * @return
     */
    public long getId(){
        IdWorker idWorker = new IdWorker();
        return idWorker.nextId();
    }

}
