package com.demo.usingconstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Demo1 {

	public static void main(String[] args) {
		 FileSystemResource fsr=new FileSystemResource("src/config/Spring-config.xml");
		 BeanFactory factory=new XmlBeanFactory(fsr);
		 PersonBeans p=(PersonBeans) factory.getBean("pc");
		 p.presonDetails();
		 }
}
