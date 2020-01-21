package com.demo.LinkList;

public class Demo1 {

	public static void main(String[] args) {
		MyLinkedList m=new MyLinkedList();
		m.add(10);
		m.add(11);
		m.add(12);
		m.add(13);
		m.add(14);
		m.add(15);
		m.add(0,9);
		System.out.println("Size="+m.size());
		
		for (int i = 0; i < m.size(); i++) {
			int m1=(int) m.get(i);
			System.out.println("ele"+m1);
		}
		m.remove(1);
		System.out.println("=======================");
		for (int i = 0; i < m.size(); i++) {
			int m1=(int) m.get(i);
			System.out.println(m1);
		}
		System.out.println(m.size());
		//m.clear();
		
	}

}
