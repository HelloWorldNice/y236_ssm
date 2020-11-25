package cn.bdqn.test;


import cn.bdqn.domain.Dept;
import cn.bdqn.domain.Employee;
import cn.bdqn.mapper.DeptMapper;
import cn.bdqn.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.*;

public class DeptTest {

    @Test
    public void testQueryByIdReturnDeptAndEmps() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        DeptMapper deptMapper = session.getMapper(DeptMapper.class);

        Dept dept = deptMapper.queryByIdReturnDeptAndEmps(3);

        System.out.println(dept);

        for (Employee emp:dept.getEmployees()) {
            System.out.println(emp);
        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryById2() throws Exception{
        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        DeptMapper deptMapper = session.getMapper(DeptMapper.class);

        Dept dept = deptMapper.queryById2(2);

        System.out.println(dept.getDeptName());

//        for (Employee emp:dept.getEmployees()) {
//            System.out.println(emp);
//        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }
}
