package com.train.gg;

public class Person {
    @Hello(value = "很牛", name = "张三丰", age = 20)
    private String name;

    public void show() {
        System.out.println("姓名：" + name);
    }
}
