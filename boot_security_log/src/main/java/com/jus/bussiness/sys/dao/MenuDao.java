package com.jus.bussiness.sys.dao;

import com.jus.bussiness.sys.vo.MenuVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author JusChui
 * @ClassName MenuDao.java
 * @Date 2021年11月28日 17:08
 * @Description
 */
@Mapper
public interface MenuDao {

    List<MenuVO> getMenus();
}
