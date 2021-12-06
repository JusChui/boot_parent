package com.jus.bussiness.sys.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @Author JusChui
 * @ClassName MenuVO.java
 * @Date 2021年11月28日 16:37
 * @Description
 */
public class MenuVO implements Serializable {
    private static final long serialVersionUID = -4138949906052570407L;

    private String id;
    private String menuUrl;
    private String menuName;
    private Integer menuOrder;  //排序
    private Integer menuLevel;  //菜单等级
    private String deleteFlag;

    private List<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
