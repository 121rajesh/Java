package org.sunbeam.kdac.list;

public class list
{
	node head;
	public list() 
	{
		
	}
	public list(node head) {
		this.head = head;
	}
	public node getHead() {
		return head;
	}
	public void setHead(node head) {
		this.head = head;
	}	

	public void addFirst(int data)
	{
		if(this.head == null)
			head = new node(data);
		else
		{
			node temp = this.head;
			this.head = new node(data);
			this.head.next = temp;
		}
	}
	
	public void addLast(int data)
	{
		if(this.head == null)
			head = new node(data);
		else
		{
			node trav = this.head;
			
			while(trav.next != null)
			{
				trav = trav.next;
			}
			trav.next = new node(data);
		}
	}
	public void deleteFirst()
	{
		if(this.head == null)
			System.out.println("List id empty ... ");
		else
		{
			this.head = this.head.next; 
					
		}
	}
	
	public void deleteLast()
	{
		if(this.head == null)
			System.out.println("List id empty ... ");
		else
		{
			node trav = this.head;
			while(trav.next.next != null)
			{
				trav = trav.next;
			}
			trav.next = null;
		}
	}
	
	public void printList()
	{
		node trav = this.head;
		while(trav !=null)
		{
			System.out.print(trav.data+" ->");
			trav = trav.next;	
		}
		System.out.println();
	}
	
}
