package com.example.spring_test;

import com.example.spring_test.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringTestApplicationTests {

    @Autowired
    private EmployeeMapper employee;

    @Test
    void contextLoads() {
        String name ="j";
        employee.selectByName(name);
    }


}
