package cn.bdqn.test;


import cn.bdqn.domain.Employee;
import cn.bdqn.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.*;

public class EmployeeTest {

    @Test
    public void testSelectAll() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过SqlSession提供的方法查询数据[参数是一个查询id,组成: namespace+id]
        List<Employee> employees = session.selectList("cn.bdqn.mapper.selectAll");


        // 5、循环遍历
        if (employees != null && employees.size() > 0){
            for (Employee employee: employees) {
                System.out.println(employee);
            }
        }
        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testInsert() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        // 4、保存
        Employee employee = new Employee();
        employee.setEmpName("张心");
        employee.setBirthday(new Date());
        employee.setEmail("123@qq.com");
        employee.setSex("女");
        employee.setAddress("水帘洞");
        session.insert("cn.bdqn.mapper.insert",employee);

        // 6、关闭SqlSession

        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testSelectById() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过SqlSession提供的方法查询数据[参数是一个查询id,组成: namespace+id]
        Employee employee = session.selectOne("cn.bdqn.mapper.selectById" , 4);

        // 5、打印
        System.out.println(employee);

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testSelectByName_1() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过SqlSession提供的方法查询数据[参数是一个查询id,组成: namespace+id]
        List<Employee> employees = session.selectList("cn.bdqn.mapper.selectByName_1" , "黄");

        // 5、打印
        if (employees != null && employees.size() > 0){
            for (Employee employee: employees) {
                System.out.println(employee);
            }
        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testSelectByName_2() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过SqlSession提供的方法查询数据[参数是一个查询id,组成: namespace+id]
        List<Employee> employees = session.selectList("cn.bdqn.mapper.selectByName_2" , "黄");

        // 5、打印
        if (employees != null && employees.size() > 0){
            for (Employee employee: employees) {
                System.out.println(employee);
            }
        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testSelectByName_3() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过SqlSession提供的方法查询数据[参数是一个查询id,组成: namespace+id]
        List<Employee> employees = session.selectList("cn.bdqn.mapper.selectByName_3" , "黄");

        // 5、打印
        if (employees != null && employees.size() > 0){
            for (Employee employee: employees) {
                System.out.println(employee);
            }
        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testSelectByName_4() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过SqlSession提供的方法查询数据[参数是一个查询id,组成: namespace+id]
        List<Employee> employees = session.selectList("cn.bdqn.mapper.selectByName_4" , "黄");

        // 5、打印
        if (employees != null && employees.size() > 0){
            for (Employee employee: employees) {
                System.out.println(employee);
            }
        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testSelectByName_5() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 4、通过SqlSession提供的方法查询数据[参数是一个查询id,组成: namespace+id]
        List<Employee> employees = session.selectList("cn.bdqn.mapper.selectByName_5" , "黄");

        // 5、打印
        if (employees != null && employees.size() > 0){
            for (Employee employee: employees) {
                System.out.println(employee);
            }
        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testInsertReturnPrimaryKey_1() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        // 4、保存
        Employee employee = new Employee();
        employee.setEmpName("李京教");
        employee.setBirthday(new Date());
        employee.setEmail("999@qq.com");
        employee.setSex("女");
        employee.setAddress("女儿国");
        session.insert("cn.bdqn.mapper.insertReturnPrimaryKey_1",employee);

        // 6、关闭SqlSession

        System.out.println(employee.getId());

        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testInsertReturnPrimaryKey_2() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        // 4、保存
        Employee employee = new Employee();
        employee.setEmpName("李晓雪");
        employee.setBirthday(new Date());
        employee.setEmail("888@qq.com");
        employee.setSex("女");
        employee.setAddress("盘丝洞");
        session.insert("cn.bdqn.mapper.insertReturnPrimaryKey_2",employee);

        // 6、关闭SqlSession

        System.out.println(employee.getId());

        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testDeleteById() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        // 4、删除
        session.delete("cn.bdqn.mapper.deleteById" , 6);

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryById() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.queryById(4);

        System.out.println(employee);

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryByNameBySex() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.queryByNameAndSex("刘建伟","男");

        System.out.println(employee);

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryByEmp() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Employee employee = new Employee();
        employee.setEmpName("李晓雪");
        employee.setSex("女");

        Employee result = employeeMapper.queryByEmp(employee);

        System.out.println(result);

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryByMap() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Map<String,Object> params = new HashMap<>();
        params.put("xxx" , "李京教");
        params.put("yyy" , "女");

        Employee result = employeeMapper.queryByMap(params);

        System.out.println(result);

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryByList() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);

        List<Employee> employees = employeeMapper.queryByList(list);

        for (Employee emp: employees) {
            System.out.println(emp);
        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryByArray() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Integer[] ids = new Integer[]{2,5,7};

        List<Employee> employees = employeeMapper.queryByArray(ids);

        for (Employee emp: employees) {
            System.out.println(emp);
        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryByIdReturnMap() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Map<String,Object> map = employeeMapper.queryByIdReturnMap(5);

        System.out.println(map);
        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryBySexReturnMaps() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Map<Integer,Employee> maps = employeeMapper.queryBySexReturnMaps("女");

        System.out.println(maps);
        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryByIdReturnEmpAndDept() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Employee employee = employeeMapper.queryByIdReturnEmpAndDept(5);

        System.out.println(employee);
        System.out.println(employee.getDept());

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryByIdReturnEmpAndDept2() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Employee employee = employeeMapper.queryByIdReturnEmpAndDept2(5);

        System.out.println(employee);
        System.out.println(employee.getDept());

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

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Employee employee = employeeMapper.queryById2(5);

        // 延迟加载/懒加载
        System.out.println(employee.getEmpName() + employee.getAddress());
        System.out.println(employee.getDept().getDeptName());

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }


    @Test
    public void testQueryByCondition() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Employee emp = new Employee();
        emp.setEmpName("黄文静");
        //emp.setSex("女");

        List<Employee> employees = employeeMapper.queryByCondition(emp);
        System.out.println(employees);

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryByConditionForChoose() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Employee emp = new Employee();
        //emp.setEmpName("黄文静");
        //emp.setSex("女");

        List<Employee> employees = employeeMapper.queryByConditionForChoose(emp);
        System.out.println(employees);

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testUpdateById() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Employee emp = new Employee();
        emp.setId(8);
        emp.setEmpName("李晓雪的二姨");
        //emp.setSex("女");

        employeeMapper.updateById(emp);

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryByIdsForArray() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Integer[] ids = {2,4 , 7 , 8};

        List<Employee> employees = employeeMapper.queryByIdsForArray(ids);
        for (Employee employee : employees){
            System.out.println(employee);
        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryByIdsForList() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        List<Integer> ids = new ArrayList<>();
        ids.add(2);
        ids.add(5);

        List<Employee> employees = employeeMapper.queryByIdsForList(ids);
        for (Employee employee : employees){
            System.out.println(employee);
        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryByIdsAndSexForMap() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        List<Integer> ids = new ArrayList<>();
        ids.add(2);
        ids.add(5);

        Map<String,Object> paramsMap = new HashMap<>();
        paramsMap.put("paramSex" , "男");
        paramsMap.put("paramIds" , ids);

        List<Employee> employees = employeeMapper.queryByIdsAndSexForMap(paramsMap);
        for (Employee employee : employees){
            System.out.println(employee);
        }

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testInsertBatch() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Employee e1 = new Employee();
        e1.setSex("未知");
        e1.setEmpName("郭郭10");
        e1.setAddress("林州");
        e1.setEmail("111@qq.com");
        e1.setBirthday(new Date());

        Employee e2 = new Employee();
        e2.setSex("女");
        e2.setEmpName("郭郭11");
        e2.setAddress("林州2");
        e2.setEmail("222@qq.com");
        e2.setBirthday(new Date());

        Employee e3= new Employee();
        e3.setSex("男");
        e3.setEmpName("郭郭12");
        e3.setAddress("林州3");
        e3.setEmail("333@qq.com");
        e3.setBirthday(new Date());

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        employeeMapper.insertBatch(employees);

        System.out.println(e1.getId());
        System.out.println(e2.getId());
        System.out.println(e3.getId());

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testInsertBatch2() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Employee e1 = new Employee();
        e1.setSex("未知");
        e1.setEmpName("郭郭4");
        e1.setAddress("林州");
        e1.setEmail("111@qq.com");
        e1.setBirthday(new Date());

        Employee e2 = new Employee();
        e2.setSex("女");
        e2.setEmpName("郭郭5");
        e2.setAddress("林州2");
        e2.setEmail("222@qq.com");
        e2.setBirthday(new Date());

        Employee e3= new Employee();
        e3.setSex("男");
        e3.setEmpName("郭郭6");
        e3.setAddress("林州3");
        e3.setEmail("333@qq.com");
        e3.setBirthday(new Date());

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        employeeMapper.insertBatch2(employees);

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testQueryByEmpName() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession(true);

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        String empName = null;

        Employee employee =  employeeMapper.queryByEmpName(empName);
        System.out.println(employee);

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testSelectByIdForCache() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session = factory.openSession();

        // 查询id为8号员工
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);

        Employee e1 = employeeMapper.queryById(8);
        System.out.println(e1); // 李晓雪的二姨

        //...
        //...
        //..
        // ...
        // 手动的去清空缓存
        session.clearCache();

        // MyBatis太粗暴了，原则：宁可错杀，不可放过
        // 一级缓存：SqlSession级别的缓存
        Employee e2 = employeeMapper.queryById(8);
        System.out.println(e2); // 李小雪的二姨

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

    @Test
    public void testSelectByIdForCache2() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        SqlSession session1 = factory.openSession();

        // 查询id为8号员工
        EmployeeMapper employeeMapper = session1.getMapper(EmployeeMapper.class);

        Employee e1 = employeeMapper.queryById(8);
        System.out.println(e1);

        // 6、关闭SqlSession
        session1.close();

        SqlSession session2 = factory.openSession();

        // 查询id为8号员工
        EmployeeMapper employeeMapper2 = session2.getMapper(EmployeeMapper.class);

        Employee e2 = employeeMapper2.queryById(8);
        System.out.println(e2);

        // 6、关闭SqlSession
        session2.close();



        // 7、关闭流
        is.close();
    }


    @Test
    public void testSelectByIdForCache_3() throws Exception{

        // 1、读取mybatis主配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、根据配置文件创建SqlSessionFactory
        // SqlSession====>Connection
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        // 3、用SqlSessionFactory工厂去创建SqlSession
        // 1、创建一个SqlSession
        SqlSession session = factory.openSession();
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee employee1 = employeeMapper.queryById(8);
        System.out.println(employee1);

        session.close();

        // 2、再创建一个SqlSession
        SqlSession session2 = factory.openSession();
        EmployeeMapper employeeMapper2 = session2.getMapper(EmployeeMapper.class);
        Employee employee2 = employeeMapper2.queryById(8);
        System.out.println(employee2);
        session2.close();

        // 6、关闭SqlSession
        session.close();

        // 7、关闭流
        is.close();
    }

}
