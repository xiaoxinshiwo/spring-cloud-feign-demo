package com.xiaoxin.springcloulddemo.service;

import com.xiaoxin.springcloulddemo.model.InspectUserInfo;
import com.xiaoxin.springcloulddemo.model.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther zhangyongxin
 * @date 2018/7/28 上午10:27
 */
@FeignClient(name = "inspectorUserService",
        url = "${remote-server-snail-base-url}")
@RequestMapping(value = "/inspector", produces = {"application/json;charset=UTF-8"})
public interface InspectorUserService {


    @PostMapping("/addOne")
    Result addOne(@RequestBody InspectUserInfo userInfo);

    @GetMapping("/findOne/{id}")
    Result findOne(@PathVariable(value = "id") int id);

}
