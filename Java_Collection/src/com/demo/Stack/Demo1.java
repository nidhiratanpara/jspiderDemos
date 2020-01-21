package com.demo.Stack;

public class Demo1 {

	public static void main(String[] args) {
		
		MyStack m=new MyStack();
		m.push(10);
		m.push(20);
		m.push(30);
		m.push(40);
		m.push(50);
		System.out.println(m.size());
		
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		System.out.println(m.pop());
		
		
		System.out.println("==========");
		System.out.println(m.size());
		System.out.println("==========");
        /*for (int i = 0; i < m.size(); i++) {
			
			System.out.println(i);
			
		}*/
        /*while(m.pop() )
        {}*/
	}

}
