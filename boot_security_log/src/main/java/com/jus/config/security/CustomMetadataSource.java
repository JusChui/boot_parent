package com.jus.config.security;

import com.jus.bussiness.sys.service.MenuService;
import com.jus.bussiness.sys.vo.MenuVO;
import com.jus.bussiness.sys.vo.Role;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

/**
 * @Author JusChui
 * @ClassName CustomMetadataSource.java
 * @Date 2021年12月05日 19:24
 * @Description
 */
@Component
public class CustomMetadataSource implements FilterInvocationSecurityMetadataSource {

    @Autowired
    private MenuService menuService;

    AntPathMatcher matcher = new AntPathMatcher();

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        List<MenuVO> allMenu = menuService.getMenus();
        if (CollectionUtils.isNotEmpty(allMenu)) {
            for (MenuVO menu : allMenu) {
                if (matcher.match(requestUrl, menu.getMenuUrl())) {
                    List<Role> roles = menu.getRoles();
                    String[] values = new String[roles.size()];
                    for (int i = 0; i < roles.size(); i++) {
                        values[i] = roles.get(i).getRoleName();
                    }
                    return SecurityConfig.createList(values);
                }
            }
            return SecurityConfig.createList("ROLE_LOGIN");
        }
        return null;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }
}
