package com.example.spring_test.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("tbl_employee") // 声明表名称
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @TableId
    private Long id;

    private String lastName;
    private String email;
    private Integer gender;
    private Integer age;
}