package com.demo.Thread;
 class MyRunnable  implements Runnable{

	public MyRunnable() {
		new Thread(this).start();
	}

	@Override
	public void run() {
		
		System.out.println("hello");
	}

}

public class Demo
{
		 public static void main(String[] args) {
		//Runnable r=new MyRunnable();
		//new Thread(r).start();
		//Thread t = new Thread();t.start();
		
		//MyRunnable run = new MyRunnable();
		//Thread t1 = new Thread(run);t1.start();
		new MyRunnable();
			 
	}
	}
