package com.jus.bussiness.sys.vo;

import java.io.Serializable;

/**
 * @Author JusChui
 * @ClassName Role.java
 * @Date 2021年11月28日 16:34
 * @Description
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -5316043324106057581L;

    private String roleId;
    private String roleName;
    private String roleNameZh;
    private String deleteFlag;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleNameZh() {
        return roleNameZh;
    }

    public void setRoleNameZh(String roleNameZh) {
        this.roleNameZh = roleNameZh;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
