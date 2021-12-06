package com.jus.bussiness.sys.service;

import com.jus.bussiness.sys.dao.MenuDao;
import com.jus.bussiness.sys.vo.MenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author JusChui
 * @ClassName MenuServiceImpl.java
 * @Date 2021年11月28日 17:33
 * @Description
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<MenuVO> getMenus() {
        return menuDao.getMenus();
    }
}
