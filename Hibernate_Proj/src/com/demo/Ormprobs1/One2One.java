package com.demo.Ormprobs1;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;

import configss.HibernateUtil;

public class One2One {

	public static void main(String[] args) {

		RestrurentDTO rdto=new RestrurentDTO();
		rdto.setRestrauntName("BBQ");
		rdto.setRestrauntRating("9");
		rdto.setRestrauntAddress("pune");
		
		ManagerDTO mdto=new ManagerDTO();
		mdto.setManagername("abhi");
		mdto.setManageremail("abhi@gmail.com");
		mdto.setManagerphoneno("3698456715");
		mdto.setManageraddress("OAR");
		mdto.setRestrurent(rdto);
		
		rdto.setManager(mdto);
		
		Session sess=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=sess.beginTransaction();
		tx.begin();
		sess.save(rdto);
		tx.commit();
		sess.close();
		System.out.println("Data inserted");
		
	}

}
