package com.fgq.wxlogin.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.fgq.wxlogin.demo.controller
 * @ClassName: TestController
 * @Author: fgq
 * @Description:
 * @Date: 2019/9/4 16:57
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    public boolean test() {
        return false;
    }

}
