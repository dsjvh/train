package com.example.spring_test.controller;

import com.example.spring_test.entity.Employee;
import com.example.spring_test.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Resource
    private EmployeeService employeeService;
    //2. 标志此方法处理 /hello 请求
    @RequestMapping("/select")
    public List<Employee> hello() {
        String name = "j";
        List<Employee> employees = employeeService.selectByName(name);
        //3. 返回.jsp页面的路径，很麻烦
        return employees;
    }
}