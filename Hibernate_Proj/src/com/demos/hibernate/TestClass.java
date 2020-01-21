package com.demos.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import configss.HibernateUtil;

public class TestClass {
//insert using hibernate
	
	public static void main(String[] args) {
		HotelDTO dto=new HotelDTO();
		
		//dto.setId(11);
		dto.setName("Lijat");
		dto.setGrade("B+");
		
		
		System.out.println("hibernate Starts");
      // Configuration cfg=new Configuration();
       //that is for defaultname
       //cfg.configure();
       
       //cfg.configure("Hibernatesss.cfg.xml");
       
       //if file is in config folder
     //  cfg.configure("configss\\Hibernatesss.cfg.xml");
       
       //that is not good practice so write in config file
     //  cfg.addAnnotatedClass(HotelDTO.class);
      // SessionFactory sf=cfg.buildSessionFactory();
		Session sess=HibernateUtil.getSessionFactory().openSession();
       // Session sess=sf.getCurrentSession();
        Transaction tx=sess.beginTransaction();
        tx.begin();
        sess.save(dto);
       //tx.rollback();
        tx.commit();
        sess.close();
       // HibernateUtil.getSessionFactory().close();
	}

}
