package com.jus.util;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @Author JusChui
 * @ClassName JSONResponse.java
 * @Date 2021年11月23日 21:09
 * @Description
 */
public class JSONResult implements Serializable {

    private Integer status;

    private String message;

    private Map<String, Object> bean;

    private List<Map<String, Object>> beans;

    private Object data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getBean() {
        return bean;
    }

    public void setBean(Map<String, Object> bean) {
        this.bean = bean;
    }

    public List<Map<String, Object>> getBeans() {
        return beans;
    }

    public void setBeans(List<Map<String, Object>> beans) {
        this.beans = beans;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
