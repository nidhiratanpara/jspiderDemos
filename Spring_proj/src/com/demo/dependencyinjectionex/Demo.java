package com.demo.dependencyinjectionex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext apx=new ClassPathXmlApplicationContext("config/Spring-config.xml");
		PhoneBean p=(PhoneBean) apx.getBean("phone");
		p.makecall();
	}
}
