package com.demo.Queue;

public class MyQueue {
	
	
	private Node first;
	private Node last;
	private int count;
	
	
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Node(e);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e);
		last=last.next;
		count++;
		
	}
	public Object peek()
	{
		if(first==null) return null;
		return first.ele;
	}
	public Object poll()
	{
		if(first==null) return null;
		Object e= first.ele;
		first=first.next;
		count--;
		return e;
	}
	public int size()
	{
		return count;
	}

	private class Node
	{
		Object ele;
		Node next;
		Node(Object e)
		{
			ele=e;
		}
		Node(Object e,Node n)
		{
			ele=e;
			next=n;
		}
	}

}
