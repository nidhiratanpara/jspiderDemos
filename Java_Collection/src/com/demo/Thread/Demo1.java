package com.demo.Thread;

class Thread1 extends Thread
{
	Thread1()
	{
		System.out.println("hello");
		//start();
	}
	@Override
	public void run() {
		//super.run();
		System.out.println("nidhi");
		
	}
	}

public class Demo1 {

	public static void main(String[] args) {
		//new Thread1();
		Thread a=new Thread1();
		a.start();
	}
}
