package com.demo.LinkList;

public class MyLinkedList {
	
	private Node first;
	private Node last;
	private int count;
	
	
	public void add(Object ele)
	{
		if(first==null)
		{
			first=new Node(ele);
			last=first;
			count++;
			return;
		}
		last.next=new Node(ele);
		last=last.next;
		count++;
		
	}
	public void add(int index,Object ele)
	{
		if(index>=size()) throw new IndexOutOfBoundsException();
		if(index==0)
		{
			first=new Node(ele,first);
			count++;
			return;
		}
		Node temp=first;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		temp.next=new Node(ele,temp.next);
		count++;
		
	}
	public Object get(int index)
	{
		if(index>=size())throw new IndexOutOfBoundsException();
		Node temp=first;
		for(int i=1;i<=index;i++)
		{
			temp=temp.next;
		}
		return temp.ele;
		
	}
	public int size()
	{
		return count;
	}
	public void remove(int index){
		if(index>=size() || index<0 ) throw new IndexOutOfBoundsException();
		if(index==0)
		{
			first=first.next;
			count--;
			return;
		}
		Node temp=first;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		count--;
	}
	
	public void clear()
	{
		first=null;
	    count =0;
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
