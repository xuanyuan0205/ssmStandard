package com.ym.ssm.service;
import com.ym.ssm.dao.EmployeeMapper;
import com.ym.ssm.pojo.Employee;
import com.ym.ssm.pojoex.EmpoyeeStatus;
import com.ym.ssm.pojoex.PageInfo;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @ClassName: EmployeeService
 * @Description: 员工服务
 * @auther: ym
 * @Date: 2019-4-12 16:45
 */
@Service
public class EmployeeService {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;
    @Autowired
   private EmployeeMapper employeeMapper;

    public Employee getEmp(Integer id){
       return employeeMapper.selectByPrimaryKey(id);
    }

    public List<Employee> getAll(){
        return  employeeMapper.selectAll();
    }

    public void createBatch(){
        SqlSession sqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);//跟上述sql区别
        EmployeeMapper employeeMapper1=sqlSession.getMapper(EmployeeMapper.class);
        for (int i = 0; i <3 ; i++) {
            employeeMapper1.insert(new Employee(null,"ttttt"+i,"1","ttttt"+i+"@1.com",1,EmpoyeeStatus.LOGOUT));
        }

        sqlSession.commit();
        sqlSession.close();
    }

    public PageInfo<Employee> callProcedure() {
        Map<String,Integer> map=new HashMap<>();
        map.put("pageindex",2);
        map.put("pagesize",5);
        map.put("total",0);
        List<Employee> employees= employeeMapper.callProcedure(map);
        PageInfo<Employee> pageInfo=new PageInfo<>();
        pageInfo.data=employees;
        pageInfo.total=map.get("total");
        return  pageInfo;
    }

}
