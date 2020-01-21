package com.demo.scopeproperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	
	
	ApplicationContext apx=new ClassPathXmlApplicationContext("config/Spring-config.xml");
	PersonBeans p=(PersonBeans) apx.getBean("pupil");
	PersonBeans p1=(PersonBeans) apx.getBean("pupil");
	System.out.println(p.hashCode());
	System.out.println(p1.hashCode());
	
}
}
