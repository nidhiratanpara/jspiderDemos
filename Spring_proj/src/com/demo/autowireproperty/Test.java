package com.demo.autowireproperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext apx=new ClassPathXmlApplicationContext("config/Spring-config.xml");
	BikeBean b=(BikeBean)apx.getBean("bike");
	b.makecall();
}
}
