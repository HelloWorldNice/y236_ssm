package cn.bdqn.mapper;

import cn.bdqn.domain.Dept;
import cn.bdqn.domain.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {

    // 根据id查询员工
    public Employee queryById(Integer id);

    // 根据员工姓名和性别查询员工
    // arg0,arg1
    // param1,param2                    arg0            arg1
    public Employee queryByNameAndSex(@Param("empName") String empName,@Param("sex") String sex);

    // 根据员工姓名和性别查询员工
    public Employee queryByEmp(Employee employee);


    // 根据员工姓名和性别查询员工
    public Employee queryByMap(Map<String,Object> params);

    // 根据id实现批量查询
    // 规定： 方法的参数传递的是一个List集合,映射文件list来去表示该List集合
    public List<Employee> queryByList(List<Integer> ids);

    // 根据id实现批量查询
    // 规定： 方法的参数传递的是一个List集合,映射文件list来去表示该List集合
    public List<Employee> queryByArray(@Param("ids") Integer[] ids);


    // 根据id查询员工信息
    public Map<String,Object> queryByIdReturnMap(Integer id);

    @MapKey("id")
    public Map<Integer,Employee> queryBySexReturnMaps(String sex);


    // 关联查询

    // 根据员工id查询员工信息（包含员工所属的部门信息）
    public Employee queryByIdReturnEmpAndDept(Integer id);

    // 根据员工id查询员工信息（包含员工所属的部门信息）
    public Employee queryByIdReturnEmpAndDept2(Integer id);


    // 根据员工id查询员工信息
    public Employee queryById2(Integer id);

    // 根据部门编号查询该部门下所有的员工信息
    public List<Employee> queryByDeptId(Integer deptId);

    // 根据员工姓名、邮箱、家庭住址、性别模糊查询员工信息
    public List<Employee> queryByCondition(Employee employee);

    // 根据员工姓名、邮箱、家庭住址、性别模糊查询员工信息
    public List<Employee> queryByConditionForChoose(Employee employee);

    // 根据员工id更新员工信息【可能更新全部字段或者更新部分字段】
    public void updateById(Employee employee);

    // 根据员工id列表查询员工信息
    public List<Employee> queryByIdsForArray(@Param("ids") Integer[] ids);

    public List<Employee> queryByIdsForList(@Param("ids") List<Integer> ids);

    // 根据员工id列表和性别查询员工信息
    public List<Employee> queryByIdsAndSexForMap(Map<String,Object> paramMap);

    // 批量保存员工
    public void insertBatch(List<Employee> employees);

    // 批量保存员工
    public void insertBatch2(List<Employee> employees);

    // 根据员工姓名进行查询
    public Employee queryByEmpName(String empName);



    // 查询全部
    // 删除
    // 修改
    // 模糊查询
}
