package com.demo.Stack;

public class MyStack {

	private int count;
	private Node last;
	private Node temp;
	
	public void push(Object e)
	{
		if(last==null)
		{
			last=new Node(e);
			count++;
			return;
		}
	   temp=new Node(e);
		temp.next=last;
		last=temp;
		count++;
	}
	public Object pop()
	{
		
		if(last==null) return null;
		System.out.println("test1");
		Object e=last.ele;
		last=last.next;
		count--;
		return e;
		
	}
	public int size()
	{
		return count;
	}

private class Node
	{
		Node next;
		Object ele;
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
