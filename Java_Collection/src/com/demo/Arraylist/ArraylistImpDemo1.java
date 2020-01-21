package com.demo.Arraylist;
import java.util.*; 

public class ArraylistImpDemo1 {

	 //MyArrayList a=new MyArrayList();
	public static void main(String[] args) {
		
	MyArrayList a=new MyArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(50);
		a.add(3,33);
		System.out.println(a.size());
		
		/*for (Integer string1 : a) {
			System.out.println(string1);
		}*/
		
		//using casting
		for (int i = 0; i < a.size(); i++) {
			int n=(Integer) a.get(i);
			System.out.println(n);
		}
		
		//using tostring overloaded
		for (int i = 0; i < a.size(); i++) {
		
		System.out.println(a.get(i).toString());
		}
		Integer k=5;
				Integer p=5;  
		boolean j=k.equals(p);
		//boolean sum=true;
		if (j){
			System.out.println("Done");
		}

	}

}
