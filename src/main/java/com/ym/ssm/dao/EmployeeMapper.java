package com.ym.ssm.dao;

import com.ym.ssm.pojo.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
    /*自定义接口*/
    List<Employee> selectAll();

    List<Employee> callProcedure(Map map);
}