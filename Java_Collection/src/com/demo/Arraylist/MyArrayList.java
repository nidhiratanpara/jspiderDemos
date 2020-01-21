package com.demo.Arraylist;

public class MyArrayList {
	
	private Object[] a=new Object[3];
	private int pos=0;
	
	public void add(Object arg)
	{
		if(pos>=a.length) increase();
		a[pos++]=arg;
		
	}
	public void add(int index,Object ele)
	{
		if(index>=size()) throw new IndexOutOfBoundsException();
		if(pos>=a.length)increase();
		for (int i =size()-1; i>=index; i--) {
			a[i+1]=a[i];
		}
		a[index]=ele;
		pos++;
	}
	private void  increase()
	{
		Object[] temp=new Object[a.length+3];
		for (int i = 0; i < a.length; i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	public Object get(int index)
	{
		if(index>=size()) throw new IndexOutOfBoundsException();
		return a[index];
		
	}
	public int size()
	{
		return pos;
	}
	public String toString()
	{
		if(size()==0)return "[]";
		String s="["+a[0];
		for (int i = 1; i < a.length; i++) {
			s=s+a[i];
		}
		s+="]";
		return s;}

}
