package com.jus.bussiness.sys.service;

import com.jus.bussiness.sys.dao.UserDao;
import com.jus.bussiness.sys.vo.UsrVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Author JusChui
 * @ClassName UserService.java
 * @Date 2021年11月28日 17:28
 * @Description
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        if (StringUtils.isNotEmpty(s)) {
            UsrVO queryParma = new UsrVO();
            queryParma.setUsrName(s);
            UsrVO usrInfo = userDao.getUsrInfo(queryParma);
            if (Objects.isNull(usrInfo)) {
                throw new UsernameNotFoundException("用户名不存在");
            }
            usrInfo.setRoles(userDao.getRolesByUsrId(usrInfo.getUsrId()));
            return usrInfo;
        }
        throw new UsernameNotFoundException("用户名不存在");
    }
}
