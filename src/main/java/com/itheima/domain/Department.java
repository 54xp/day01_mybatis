package com.itheima.domain;

import java.io.Serializable;

/**
 * @author xp
 * @create 2020-01-02 15:02
 */

public class Department implements Serializable {
    private static final long serialVersionUID = 4058039304196118907L;

    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
