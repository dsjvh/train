package com.example.spring_test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.spring_test.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper extends BaseMapper<Employee> {

    List<Employee> selectByName(@Param("name") String name);

}