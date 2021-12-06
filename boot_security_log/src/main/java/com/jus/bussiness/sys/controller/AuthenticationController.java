package com.jus.bussiness.sys.controller;

import com.jus.bussiness.sys.vo.UsrVO;
import com.jus.util.JSONResult;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author JusChui
 * @ClassName AuthenticationController.java
 * @Date 2021年12月05日 20:28
 * @Description
 */
@RestController
public class AuthenticationController {

    @RequestMapping("/auth/getUserInfo")
    public JSONResult getUserInfo(Authentication authentication) {
        UsrVO principal = (UsrVO) authentication.getPrincipal();
        JSONResult result = new JSONResult();
        result.setStatus(200);
        result.setData(principal);
        return result;
    }
}
