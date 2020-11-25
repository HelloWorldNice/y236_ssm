package cn.bdqn.mapper;

import cn.bdqn.domain.Dept;

public interface DeptMapper {

    // 根据部门编号查询部门信息
    public Dept queryById(Integer id);

    // 根据部门编号查询部门信息，同时需要把该部门下的员工信息一并查询出来
    public Dept queryByIdReturnDeptAndEmps(Integer id);


    // 根据部门编号查询部门信息（分步查询）
    public Dept queryById2(Integer id);
}
