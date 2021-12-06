package com.jus.config.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jus.util.JSONResult;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author JusChui
 * @ClassName CustomAuthenticationFailureHandler.java
 * @Date 2021年12月05日 20:00
 * @Description
 */
@Component
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.setContentType("application/json;charset=utf-8");
        JSONResult result = new JSONResult();
        result.setStatus(400);
        if (e instanceof UsernameNotFoundException) {
            result.setMessage("用户名不存在!");
        } else if (e instanceof BadCredentialsException) {
            result.setMessage("用户名或密码输入错误！");
        } else if (e instanceof LockedException) {
            result.setMessage("账号被锁定，请联系管理员！");
        } else if (e instanceof CredentialsExpiredException) {
            result.setMessage("密码过期，请联系管理员！");
        } else if (e instanceof AccountExpiredException) {
            result.setMessage("账号过期，请联系管理员！");
        } else if (e instanceof DisabledException) {
            result.setMessage("账号被禁用，请联系管理员！");
        } else {
            result.setMessage("登录失败！");
        }
        PrintWriter printWriter = httpServletResponse.getWriter();
        printWriter.write(new ObjectMapper().writeValueAsString(result));
        printWriter.flush();
        printWriter.close();
    }
}
