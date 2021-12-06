package com.jus.bussiness.sys.dao;

import com.jus.bussiness.sys.vo.Role;
import com.jus.bussiness.sys.vo.UsrVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author JusChui
 * @ClassName UserDao.java
 * @Date 2021年11月28日 16:52
 * @Description
 */
@Mapper
public interface UserDao {

    UsrVO getUsrInfo(@Param("usr") UsrVO usrVO);

    List<Role> getRolesByUsrId(String id);
}
