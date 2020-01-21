package com.demo.List;

import java.util.ArrayList;
import java.util.List;


public class Demo {
public static void main(String[] args) {
	
	
	List s=new ArrayList();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(1,11);
	System.out.println(s);
	s.remove(2);
	System.out.println(s);
	s.remove((Integer)30);
	System.out.println(s);
	s.remove(new Integer(10));
	System.out.println(s);
	s.clear();
	System.out.println(s);
	
}
}
