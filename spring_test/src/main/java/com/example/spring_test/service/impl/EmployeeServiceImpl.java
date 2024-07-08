package com.example.spring_test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.spring_test.entity.Employee;
import com.example.spring_test.mapper.EmployeeMapper;
import com.example.spring_test.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mr.Bu
 * @version 1.0.0
 * @date 2024/7/7 15:47
 * @des
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> selectByName(String name) {
        return employeeMapper.selectByName(name);
    }
}
