package com.demos.One2One;

import org.hibernate.Session;
import org.hibernate.Transaction;

import configss.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		MobileDTO mDto=new MobileDTO();
		mDto.setMobile_model("Redmi4i");
		mDto.setMobile_color("blue");
		
		BatteryDTO bDTO=new BatteryDTO();
		bDTO.setBatteryName("nokia");
		bDTO.setBatteryModel("ES6");
		bDTO.setBatteryType("small");
		bDTO.setMobile(mDto);
		
		mDto.setBattery(bDTO);
           
		Session sess=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=sess.beginTransaction();
		tx.begin();
		sess.save(mDto);
		tx.commit();
	}

}
