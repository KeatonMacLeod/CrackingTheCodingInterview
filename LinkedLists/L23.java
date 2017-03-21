//KeatonMacLeod
package LinkedLists;
import java.util.Random;

import DataStructures.LinkedList;
import DataStructures.Node;

public class L23 {
	
	public static void main(String[]args)
	{
		Random random = new Random();
		LinkedList l = new LinkedList();
		int max = 10;
		int min = 1;
		Node node = null;
		int position = 4;

		for (int i = 0; i < 10; i++)
		{
			if (i == position)
			{
				//Insert returns a Node so we can grab the node.
				 node = l.insert(random.nextInt(max - min + 1) + min);
			}
			else
			{
				int value = random.nextInt(max - min + 1) + min;
				l.insert(value);
			}
		}
		
		System.out.println("BEFORE");
		l.print();
		System.out.println();
		System.out.println("Deleting node in position [" + position + "]");
		System.out.println();
		deleteMiddleNode(node);
		System.out.println("AFTER");
		l.print();
	}
	
	static void deleteMiddleNode(Node node)
	{
		Node prev = node;
		Node next = node.next;
		
		while (next != null)
		{
			prev.val = next.val;
			next = next.next;
			
			if (next != null)
			{
				prev = prev.next;
			}//if
			
		}//while
		prev.next = null;
	}
}




//THE CODE BELOW DELETES THE MIDDLE NODE

/*
public class L23 {
	
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.insert(6);
		l.insert(7);
		
		System.out.println("BEFORE");
		l.print();
		deleteMid(l);
		System.out.println("AFTER");
		l.print();
	}
	
	static void deleteMid(LinkedList l)
	{
		Node prev = l.top;
		Node next = l.top;
		
		while (next != null)
		{
			next = next.next;
			if (next == null)
				break;
				
			else {
				next = next.next;
				prev = prev.next;
			}
		}//while
		
		prev.next = prev.next.next;
	}
}
*/
