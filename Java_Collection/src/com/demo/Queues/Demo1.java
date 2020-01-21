package com.demo.Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {
public static void main(String[] args) {
	
	
	List s=new ArrayList();
	s.add(1);
	s.add(2);
	s.add(3);
	s.add(4);
	s.add(1,11);
	System.out.println(s);
	
	
	Queue q=new LinkedList();
	Queue q1=new PriorityQueue();
	q1.add(22);
	q1.add(11);
	q1.add(66);
	q1.add(5);
	System.out.println(q1);
	q.add(20);
	q.add(10);
	q.add(40);
	q.add(30);
	
	System.out.println(q1.addAll(q));
	System.out.println(q);
	q.addAll(s);
	System.out.println(q);
	q1.addAll(q);
	System.out.println(q1);
	
}
}
