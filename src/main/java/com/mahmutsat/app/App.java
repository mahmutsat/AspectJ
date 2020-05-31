package com.mahmutsat.app;

import com.mahmutsat.model.Staff;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");

        Staff staff = context.getBean("beanStaff", Staff.class);
        System.out.println("Name : " + staff.getName());
        staff.greeting("Hello World..");
    }
}
