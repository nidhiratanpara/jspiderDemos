package com.demo.Orm1to2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import configss.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		CompanyDTO companyDTO=new CompanyDTO();
		//companyDTO.setCompanyId(2);
		companyDTO.setCompanyName("tcs");
		companyDTO.setCompanyAddress("Pune");
		companyDTO.setCompanyContact("205459215");
		
		EmployeeDTO emp1=new EmployeeDTO();
		//emp1.setEmpId(4);
		emp1.setEmpName("vasu");
		emp1.setEmpEmail("nidhi@gmail.com");
		emp1.setEmpPhono("2394578125");
		emp1.setCompany(companyDTO);
		
		EmployeeDTO emp2=new EmployeeDTO();
		//emp2.setEmpId(5);
		emp2.setEmpName("nidhi");
		emp2.setEmpEmail("nidhi@gmail.com");
		emp2.setEmpPhono("2394578125");
		emp2.setCompany(companyDTO);
		
		EmployeeDTO emp3=new EmployeeDTO();
		//emp3.setEmpId(6);
		emp3.setEmpName("nidhi");
		emp3.setEmpEmail("nidhi@gmail.com");
		emp3.setEmpPhono("2394578125");
		emp3.setCompany(companyDTO);
		
		List l=new ArrayList();
		l.add(emp1);
		l.add(emp2);
		l.add(emp3);
		companyDTO.setEmployee(l);
		
		Session sess=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=sess.beginTransaction();
		tx.begin();
		sess.save(companyDTO);
		tx.commit();
		sess.close();
	}

}
