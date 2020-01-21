package com.demo.curdoperations;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import configss.HibernateUtil;


public class Demo1 {

	public static void main(String[] args) {
		// Runtime r = Runtime.getRuntime();
		// r.gc();

		System.out.print("enter any number: 1 for insert  2 for show 3 for update 4 for delete \n");
		System.out.println("Enter number=");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		CustomerDTO cdDTO = new CustomerDTO();
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();
		tx.begin();

		switch (n) {

		case 1:
			System.out.println("insert value");
			// int i;
			String s1, s2;
			// System.out.println("id:");
			System.out.println("name:");
			System.out.println("city:");
			Scanner sc1 = new Scanner(System.in);
			// i=sc1.nextInt();
			s1 = sc1.next();
			s2 = sc1.next();
			// cdDTO.setCid(i);
			cdDTO.setCname(s1);
			cdDTO.setCity(s2);
			ses.save(cdDTO);
			System.out.println("Data inserted.");
			/*
			 * System.out.println("Do you want to continue?");
			 * System.out.println("Press 1 for continue 2 for exit"); Scanner
			 * d=new Scanner(System.in); int s=d.nextInt(); if(s==1) { n=1; }
			 * else { return; }
			 */
			break;

		case 2:
			System.out.println("Select value");
			System.out.println("enter id:");
			Scanner sid = new Scanner(System.in);
			int id2 = sid.nextInt();
			CustomerDTO cusdto = ses.get(CustomerDTO.class, id2);
			System.out.println("Customer Id:" + cusdto.getCid());
			System.out.println("Customer Name:" + cusdto.getCname());
			System.out.println("Customer City:" + cusdto.getCity());
			break;

		case 3:
			System.out.println("update value");
			System.out.println("enter id:");
			Scanner sb = new Scanner(System.in);
			int id = sb.nextInt();
			System.out.print("update city press c & update name press n && update both presss cn \n");
			String scase = sb.next();
			
			switch (scase) {
			case "c":

				System.out.println("enter city:");
				Scanner sc = new Scanner(System.in);
				String sct = sc.next();
				CustomerDTO custo = ses.get(CustomerDTO.class, id);
				custo.setCity(sct);
				break;

			case "n":

				System.out.println("enter name:");
				Scanner scna = new Scanner(System.in);
				String sn = scna.next();
				CustomerDTO cust = ses.get(CustomerDTO.class, id);
				cust.setCname(sn);
				break;

			case "cn":

				System.out.println("enter name:");
				System.out.println("enter city:");
				Scanner scv = new Scanner(System.in);
				String snc = scv.next();
				String scc = scv.next();
				CustomerDTO custoc = ses.get(CustomerDTO.class, id);
				custoc.setCname(snc);
				custoc.setCity(scc);

				break;
			}

			System.out.println("Data updated.");
			break;

		case 4:
			System.out.println("delete value");
			System.out.println("Enter id:");
			Scanner scD = new Scanner(System.in);
			int i = scD.nextInt();
			CustomerDTO hdto = new CustomerDTO();
			hdto.setCid(i);
			ses.delete(hdto);
			System.out.println("Data Deleted.");

			break;

		default:
			System.out.println("please select given option");
			break;
		}

		tx.commit();
		ses.close();
		HibernateUtil.getSessionFactory().close();
	}

}
