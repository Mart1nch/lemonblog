package com.martin.lemonblog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description TODO
 * @Date 2021/5/15
 * @Author by matian
 */
@Controller
@Api("页面跳转功能")
public class BootController {
    @ResponseBody
    @RequestMapping("/helloworld")
    @ApiOperation("helloworld接口")
    public String hello() {
        return "helloworld";
    }

    @RequestMapping("/demo")
    public String demo() {
        return "demo";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    @RequestMapping("/article")
    public String article() {
        return "article";
    }
    @RequestMapping("/write")
    public String write() {
        return "write";
    }
    @RequestMapping("/about")
    public String about() {
        return "about";
    }
}
