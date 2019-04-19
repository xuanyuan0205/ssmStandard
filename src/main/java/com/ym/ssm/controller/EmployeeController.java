package com.ym.ssm.controller;

import com.ym.ssm.pojo.Employee;
import com.ym.ssm.pojoex.PageInfo;
import com.ym.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ClassName: EmployeeController
 * @Description: 员工控制器
 * @auther: ym
 * @Date: 2019-4-12 16:33
 */
@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @RequestMapping("/emps")
    public String emps(Model model){

//        PageHelper.startPage(1,2);
        List<Employee> employees=employeeService.getAll();
//        List<Employee> employees= employeeService.getAll();
        model.addAttribute("users",employees);
        Employee user=employeeService.getEmp(1);
        model.addAttribute("user",user);
        PageInfo<Employee> pageInfo=employeeService.callProcedure();
        System.out.println("分页数据：***********，总数："+pageInfo.total);
        for (Employee datum : pageInfo.data) {
            System.out.println(datum);
        }
        System.out.println("分页数据：***********");
        return "list";
    }

    @RequestMapping("/createbatch")
    public String createEmployees(){
        employeeService.createBatch();
        return "batchSuccess";
    }
}
