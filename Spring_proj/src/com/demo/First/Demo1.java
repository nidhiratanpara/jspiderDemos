package com.demo.First;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Demo1 {

	public static void main(String[] args) {
           //this privide a tight coupling
		/*PresonBean p=new PresonBean();
		p.setName("Nidhi");
		p.setDob("12/5/92");
		p.setGender("female");
		p.setAddress("jnd");
		p.presonDetails();
		*/
		
		/*File f=new File("C:\\MayankJava\\Spring_proj\\src\\Spring-config.xml");
		FileSystemResource fsr=new FileSystemResource(f);
		*/
		
		FileSystemResource fsr=new FileSystemResource("src/config/Spring-config.xml");
		BeanFactory factory=new XmlBeanFactory(fsr);
		//PresonBean persons=(PresonBean) factory.getBean(PresonBean.class);
		PresonBean person=(PresonBean) factory.getBean("person");
		PresonBean pm=(PresonBean) factory.getBean("p");
		person.presonDetails();
		pm.presonDetails();
		//persons.presonDetails();
	}

}
