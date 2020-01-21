package com.demos.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import configss.HibernateUtil;

public class TestClass2 {
	
	public static void main(String[] args) {
		BookDTO bdto=new BookDTO();
		bdto.setId(11);
		bdto.setBname("java");
		bdto.setBauthname("m.k.patel");
		System.out.println("hibernate Starts");
		Session sess=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=sess.beginTransaction();
		tx.begin();
		sess.save(bdto);
		tx.commit();
		sess.close();
		System.out.println("Data inserted");
				
	}
	
	

}
