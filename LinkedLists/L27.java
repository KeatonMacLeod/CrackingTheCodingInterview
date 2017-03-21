//KeatonMacLeod
package LinkedLists;
import java.util.Random;

import DataStructures.LinkedList;
import DataStructures.Node;

public class L27 {
	
	public static void main (String[] args)
	{
		//'I' appears as 73 when it is returned
		Node node = new Node('I', null);
		Random random = new Random();
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		int max = 4;
		int min = 1;
		
		for (int i = 0; i < 10; i++)
		{
			if (i == 3)
			{
				l1.insertNode(node);
			}
			else
			{
				int value = random.nextInt(max - min + 1) + min;
				l1.append(value);
			}
		}
		
		for (int i = 0; i < 10; i++)
		{
			if (i == 3)
			{
				l2.insertNode(node);
			}
			int value = random.nextInt(max - min + 1) + min;
			l2.append(value);
		}
	
		Node returnedNode = intersection(l1, l2);
		System.out.println(returnedNode.val);
	}
	
	static LinkedList reverse (LinkedList l)
	{
		Node prev = null;
		Node curr = l.top();
		Node next = curr.next;
		while (curr != null)
		{
			curr.next = prev;
			curr = next;
			if (next == null)
				break;
			next = next.next;
		}
		return l;
	}
	
	static Node intersection(LinkedList l1, LinkedList l2)
	{
	l2 = reverse(l2);
	Node currListOne = l1.top();
	Node currListTwo = l2.top();
	int count = 0;
	while (currListOne != null || currListTwo != null)
	{
		if (currListOne == currListTwo)
			return currListOne;
		if (count %2 == 0)
			currListOne = currListOne.next;
		else
			currListTwo = currListTwo.next;
	}
	return null;
	}
}
