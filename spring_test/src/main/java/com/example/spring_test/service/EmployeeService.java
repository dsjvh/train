package com.example.spring_test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.spring_test.entity.Employee;

import java.util.List;


/**
 * @author mr.Bu
 * @version 1.0.0
 * @date 2024/7/7 15:45
 * @des
 */
public interface EmployeeService extends IService<Employee> {

    List<Employee> selectByName(String name);
}
