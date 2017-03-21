//KeatonMacLeod
package LinkedLists;
import java.util.Random;

import DataStructures.LinkedList;
import DataStructures.Node;

public class L28 {

	/************************************************************
	 * The fast node has a head start of k nodes before the loop.
	 * Since the top node is k nodes from the start of the loop,
	 * if we leave fast where it was when the nodes met, and then
	 * set slow to top and advance them one at a time, then we get
	 * the loop start
	 ************************************************************/
	
	public static void main (String[] args)
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
		l.print();
		
		//This will always return the first node, as that's where the loop starts.
		//You can adjust this to make the list circular at any given node.
		l.makeCircular();
		Node returnedNode = loopDetection(l);
		System.out.println(returnedNode.val);
		
	}
	
	static Node loopDetection (LinkedList l)
	{
		Node slow = l.top();
		Node fast = l.top();
		
		do
		{
			slow = slow.next;
			fast = fast.next.next;
			
		} while (fast != null && slow != fast);
		
		if (fast.next == null)
			return null;
		
		slow = l.top();
		
		while (slow != fast)
		{
			slow = slow.next;
			fast = fast.next;
		}
		
		return fast;
	}
}
