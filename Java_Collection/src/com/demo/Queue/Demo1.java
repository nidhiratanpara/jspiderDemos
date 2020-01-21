package com.demo.Queue;

public class Demo1 {

	public static void main(String[] args) {
		
		
		MyQueue q=new MyQueue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(10);
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.poll());
		while(q.peek() !=null)
		{
			System.out.println("POll ele:"+q.poll());
		}
	}

}
