//KeatonMacLeod
package LinkedLists;
import java.util.Random;

import DataStructures.LinkedList;
import DataStructures.Node;

public class L24 {
	
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
		System.out.println("BEFORE");
		l.print();
		partition(l, 5);
		System.out.println("AFTER");
		l.print();
	}
	
	static void partition(LinkedList l, int partition)
	{
		Node prev = l.top();
		Node curr = l.top().next;
		
		while (curr != null)
		{
			if (curr.val < partition)
			{
				if (prev.next == curr)
				{
					int temp = prev.val;
					prev.val = curr.val;
					curr.val = temp;
				}
				
				else
				{
					int temp = prev.next.val;
					prev.val = curr.val;
					curr.val = temp;
				}
				
				prev = prev.next;
			}//if
			curr = curr.next;
		}//while
	}//partition
}
