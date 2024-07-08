package com.train.gg;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        // 获取Person类的Class对象
        Class<Person> personClass = Person.class;

        // 获取Person类中的所有成员变量
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            // 判断成员变量上是否有Hello注解
            if (field.isAnnotationPresent(Hello.class)) {
                Hello hello = field.getAnnotation(Hello.class);
                System.out.println("成员变量" + field.getName() + "上的Hello注解：");
                System.out.println("value: " + hello.value());
                System.out.println("name: " + hello.name());
                System.out.println("age: " + hello.age());
            }
        }

        // 获取Person类中的所有方法
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            // 判断方法上是否有Hello注解
            if (method.isAnnotationPresent(Hello.class)) {
                Hello hello = method.getAnnotation(Hello.class);
                System.out.println("方法" + method.getName() + "上的Hello注解：");
                System.out.println("value: " + hello.value());
                System.out.println("name: " + hello.name());
                System.out.println("age: " + hello.age());
            }
        }
    }
}
