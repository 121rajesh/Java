package org.sunbeam.kdac.list;

import org.sunbeam.kdac.list.StackOverflowException;
import org.sunbeam.kdac.list.StackUnderflowException;

public class Stack
{
	public list l1 = new list();

	public Stack()
	{
	
	}

	public boolean isStackEmpty()
	{
		return l1.head == null; 
	}
	
		
	public void Push(int element) 
	{
		l1.addFirst(element);
	}

	public void Pop() throws StackUnderflowException 
	{
		if(this.isStackEmpty())
		{
			throw new StackUnderflowException("Stack is empty !!");
		}
		l1.deleteFirst();
	}

	public int Peek() throws StackUnderflowException
	{
		if(this.isStackEmpty())
		{
			throw new StackUnderflowException("Stack is empty !!");
		}
		return l1.head.data;
	}
}