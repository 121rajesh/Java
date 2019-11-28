package org.sunbeam.kdac.list;

public class node
{
	int data;
	node next;
	public node() 
	{
		this.data = 0;
		this.next = null;
	}
	public node(int data) 
	{
		this.data = data;
	}
	public node(int data, node next) {
		this.data = data;
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public node getNext() {
		return next;
	}
	public void setNext(node next) {
		this.next = next;
	}
	
	public String toString() {
		return "node [data=" + data + ", next=" + next + "]";
	}
	
	
}

