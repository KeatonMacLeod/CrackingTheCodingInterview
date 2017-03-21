//KeatonMacLeod
package LinkedLists;
import java.util.Random;
import DataStructures.LinkedList;
import DataStructures.Node;

public class L21 {
	
	public static void main(String[] args)
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
		
		System.out.println("BEFORE:");
		l.print();
		removeDups(l);
		System.out.println("AFTER:");
		l.print();
	}
	
	static void removeDups (LinkedList l)
	{
		Node curr = l.top();
		while (curr != null)
		{
			Node prev = curr;
			Node next = curr.next;
			
			while (next!= null)
			{
				if (curr.val == next.val)
				{
					if (next.next == null)
					{
						prev.next = null;
						next.next = null;
					}
					else if (next.next.next == null)
					{
						prev.next = next.next;
						next.next = null;
					}
					else
					{
						prev.next = next.next;
						next.next = next.next.next;
					}
				}
			
				prev = prev.next;
				next = next.next;
				
			}//inner
			
			curr = curr.next;
			
		}//outer
	}//removeDups
}