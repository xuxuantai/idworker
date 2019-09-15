package com.nju.idworker.controller;

import com.nju.idworker.util.IdWorker;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by XXT on 2019/9/15.
 */
@Controller
public class IdController {

    @ApiOperation(value = "获取下一个分布式全局唯一ID", notes = "点击直接获取")
    @ResponseBody
    @RequestMapping(value = "/getUniqueId.do", method = RequestMethod.GET)
    public Object getUniqueId(HttpServletRequest request){
        IdWorker idWorker = new IdWorker();
        String uniqueId = Long.toString(idWorker.nextId());
        Map<String, Object> resultMap = new HashMap();
        resultMap.put("currentTime", new Date());
        resultMap.put("UniqueId", uniqueId);
        return resultMap;
    }

    @ApiOperation(value = "获取下一个分布式全局唯一ID(指定数据中心与机器)", notes = "输入指定的datacenterId与machineId")
    @ResponseBody
    @RequestMapping(value = "/getUniqueIdByDatacenterIdAndMachineId.do/{datacenterId}/{machineId}", method = RequestMethod.GET)
    public Object getUniqueIdByDatacenterIdAndMachineId(HttpServletRequest request, @PathVariable String datacenterId, @PathVariable String machineId){

        IdWorker idWorker = new IdWorker(Long.parseLong(datacenterId), Long.parseLong(machineId));
        String uniqueId = Long.toString(idWorker.nextId());
        Map<String, Object> resultMap = new HashMap();
        resultMap.put("currentTime", new Date());
        resultMap.put("UniqueId", uniqueId);
        return resultMap;
    }


}
