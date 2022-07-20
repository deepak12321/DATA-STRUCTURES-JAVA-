import java.util.*;

public class SinglyLinkedList
{
	Node head,temp;

	class Node // creating node 
	{
		String data;
		Node next;
		Node(String data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void add(String data) //add function
	{
		Node n = new Node(data);
		temp = head;
		if(head==null)
		{
			head=n;
		}
		else
		{
		while(temp.next!=null)
		{
			temp=temp.next; //temp = null
		}
		temp.next=n;
		}
			
	}
	
	public void addFront(String data) // add at front function
	{
		Node n = new Node(data);
		if(head == null) head = n;
		else 
		{
			n.next =head;
			head = n;
		}
	}
	
	public void addAtIndex(int a,String data) // function to add element at random index
	{
		Node n = new Node(data);
		temp = head;
		for(int i=0 ;i<a-1;i++)
		{
			temp=temp.next;
		}
		n.next = temp.next;
		temp.next=n;
//		System.out.println("haha :"+temp.data);
	}
	public void deleteFront()
	{
		head=head.next;
	}
	
	public void delete()
	{
		int a = length();
		
		temp=head;
		for(int i  =0;i<a-2;i++)
		{
			temp = temp.next;
		}
		temp.next=null;
	}
	public int length()
	{
		int count=0;
		temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
		
	}
	public String getAtIndex(int a)
	{
		temp = head;
		for(int i =0;i<a;i++)
		{
			temp = temp.next;
		}
		return temp.data;
	}
	
	public void show()
	{
//		Node n = new Node();
		temp=head;
		System.out.print("\nHead--> ");
		while(temp!=null)
		{
			if(temp.next!=null) System.out.print(temp.data+" -->  ");
			else System.out.print(temp.data+"");
			temp = temp.next;
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SinglyLinkedList l = new SinglyLinkedList();
		l.add("3");
		l.add("4");
		l.addFront("1");
		l.addAtIndex(1,"2");
		l.show();
		l.delete();
		l.show();
		
	}

}
