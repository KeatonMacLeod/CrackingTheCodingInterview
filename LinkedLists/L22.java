//KeatonMacLeod
package LinkedLists;
import java.util.Random;

import DataStructures.LinkedList;
import DataStructures.Node;

public class L22 {
	
	public static void main (String[]args)
	{
		Random random = new Random();
		LinkedList l = new LinkedList();
		int max = 10;
		int min = 1;

		for (int i = 0; i < 10; i++)
		{
			int value = random.nextInt(max - min + 1) + min;
			l.insert(value);
		}
		
		System.out.print("LIST: ");
		l.print();
		Node dataOne = nthLast(l, 3);
		System.out.println("Third last node: " + dataOne.val);
		Node dataTwo = nthLast(l, 5);
		System.out.println("Fifth last node: " + dataTwo.val);
		Node dataThree = nthLast(l, 9);
		System.out.println("Ninth last node: " + dataThree.val);
	}
	
	static Node nthLast (LinkedList l, int num)
	{
		int count;
		Node next = l.top();
		
		for (count = 0; count < num && next != null; count++)
			next = next.next;
		
		Node prev = l.top();
		
		while(next != null)
		{
			if (count <= 0)
			{
				next = next.next;
				if (next != null)
				{
					prev = prev.next;
				}
			}
			else
			{
				prev = prev.next;
				next = next.next;
			}
		}
		
		return prev;
	}
}

