package com.ithema.test;

import com.itheima.dao.EmployeeMapper;
import com.itheima.domain.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author xp
 * @create 2020-01-02 15:25
 */

public class EmployeeTest {
    @Test
    public void getAllEmployee() throws Exception{
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        List<Employee> empall = employeeMapper.findAll();
        for (Employee employee : empall) {
            System.out.println("employee = " + employee);
        }
        session.close();
        in.close();
    }
    @Test
    public void   getEmpAndDept() throws Exception{
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee empAndDept = employeeMapper.getEmpAndDept(3);
        System.out.println("empAndDept = " + empAndDept);
        session.close();
        in.close();
    }

    @Test
    public void   getDeptStep() throws Exception{
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee empAndDept = employeeMapper.getDeptStep(3);
        System.out.println("empAndDept = " + empAndDept);
        session.close();
        in.close();
    }

}
