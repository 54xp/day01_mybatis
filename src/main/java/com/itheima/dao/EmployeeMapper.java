package com.itheima.dao;

import com.itheima.domain.Employee;

import java.util.List;

/**
 * @author xp
 * @create 2020-01-02 15:10
 */

public interface EmployeeMapper {
    List<Employee> findAll();

    Employee getEmpAndDept(Integer id);

    Employee getDeptStep(Integer id);
}
