package com.ithema.test;

import com.itheima.dao.DepartmentMapper;
import com.itheima.dao.EmployeeMapper;
import com.itheima.domain.Department;
import com.itheima.domain.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author xp
 * @create 2020-01-02 17:08
 */

public class DepartmentTest {
    @Test
    public void   getDeptName() throws Exception{
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = sqlSessionFactory.openSession();
        DepartmentMapper departmentMapper = session.getMapper(DepartmentMapper.class);
        Department deptName = departmentMapper.getDeptName(1);
        System.out.println("deptName = " + deptName);
        session.close();
        in.close();
    }
}
