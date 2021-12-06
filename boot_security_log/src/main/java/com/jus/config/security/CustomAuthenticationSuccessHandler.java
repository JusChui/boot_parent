package com.jus.config.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jus.util.JSONResult;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author JusChui
 * @ClassName CustomAuthenticationSuccessHandler.java
 * @Date 2021年12月05日 20:08
 * @Description
 */
@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        JSONResult result = new JSONResult();
        result.setStatus(200);
        result.setMessage("登录成功！");
        httpServletResponse.setContentType("application/json;charset=utf-8");
        PrintWriter writer = httpServletResponse.getWriter();
        writer.write(new ObjectMapper().writeValueAsString(result));
        //httpServletResponse.sendRedirect("/");
        writer.flush();
        writer.close();
    }


}
