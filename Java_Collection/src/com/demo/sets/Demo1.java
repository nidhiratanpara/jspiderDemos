package com.demo.sets;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
public static void main(String[] args) {
	  Set s=new HashSet();
	  s.add("java");
	  s.add("C++");
	  s.add(".net");
	 System.out.println(s.add("java"));
	  System.out.println(s);
}
}
