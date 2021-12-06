package com.jus.bussiness.sys.service;

import com.jus.bussiness.sys.vo.MenuVO;

import java.util.List;

/**
 * @Author JusChui
 * @ClassName MenuService.java
 * @Date 2021年11月28日 17:32
 * @Description
 */
public interface MenuService {

    List<MenuVO> getMenus();
}
