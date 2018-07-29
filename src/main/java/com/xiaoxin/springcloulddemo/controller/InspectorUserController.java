package com.xiaoxin.springcloulddemo.controller;

import com.xiaoxin.springcloulddemo.model.InspectUserInfo;
import com.xiaoxin.springcloulddemo.model.Result;
import com.xiaoxin.springcloulddemo.service.InspectorUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther zhangyongxin
 * @date 2018/7/28 上午10:37
 */
@RequestMapping("/inspector")
@RestController
public class InspectorUserController {

    @Autowired(required = false)
    private InspectorUserService inspectorUserService;

    @PostMapping("/addOne")
    public Result addOne(@RequestBody InspectUserInfo userInfo) {
        return inspectorUserService.addOne(userInfo);
    }

    @GetMapping("/findOne/{id}")
    public Result findOne(@PathVariable int id) {
        return inspectorUserService.findOne(id);
    }
}
