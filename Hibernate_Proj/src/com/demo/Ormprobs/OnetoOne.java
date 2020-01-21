package com.demo.Ormprobs;

import org.hibernate.Session;
import org.hibernate.Transaction;

import configss.HibernateUtil;

public class OnetoOne {

	public static void main(String[] args) {
            CollegeDTO collegeDTO=new CollegeDTO();
            collegeDTO.setCollegename("balaji");
            collegeDTO.setCollegeaddress("ajnd");
            collegeDTO.setContactno("9874562815");
            
            PrincipalDTO principalDTO=new PrincipalDTO();
            principalDTO.setPrincipalname("kp.patel");
            principalDTO.setEmailid("kp@gmail.com");
            principalDTO.setPhoneno("7895432159");
            principalDTO.setAddress("zanzarda");
            principalDTO.setCollege(collegeDTO);
           
            collegeDTO.setPrincipal(principalDTO);
            
            Session sess=HibernateUtil.getSessionFactory().openSession();
            Transaction tx=sess.beginTransaction();
            
            tx.begin();
            sess.save(collegeDTO);
            tx.commit();
            sess.close();
             System.out.println("Data inserted");
	}

}
