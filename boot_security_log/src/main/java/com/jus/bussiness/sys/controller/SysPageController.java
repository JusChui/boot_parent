package com.jus.bussiness.sys.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author JusChui
 * @ClassName TestLogController.java
 * @Date 2021年12月04日 16:32
 * @Description
 */
@Controller
public class SysPageController {

    private Logger logger = LoggerFactory.getLogger(SysPageController.class);

    @RequestMapping("/log")
    public void test(String param) {
        logger.info("测试日志:param=======>" + param);
    }


    @RequestMapping(value = {"/", "/index"})
    public String indexPage() {
        return "index";
    }

    /**
     * 登录页面
     *
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "sys/login";
    }


}
