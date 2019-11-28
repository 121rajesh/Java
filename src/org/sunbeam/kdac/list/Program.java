package org.sunbeam.kdac.list;


import java.util.Scanner;

class Program
{
	
	public static int menuchoice()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("Enter the choice: ");
		
		return sc.nextInt();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int choice =0;
		Stack myStack = new Stack();
		while((choice = Program.menuchoice()) != 0)
		{
			try {
				switch(choice)
				{
				case 1:
						System.out.print("Enter elements : ");
						int element = sc.nextInt();
						myStack.Push(element);
						System.out.println("Element inserted !");
					break;
				case 2:
						System.out.println("Poped element is: "+myStack.Peek());
						myStack.Pop();
					break;
				case 3:
						System.out.println("Top element is : "+myStack.Peek());
					break;
					
				}
			} catch (StackUnderflowException e)
			{
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}
}










