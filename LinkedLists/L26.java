//KeatonMacLeod
package LinkedLists;
import DataStructures.LinkedList;
import DataStructures.Node;
import DataStructures.Stack;

public class L26 {
	
	public static void main (String[] args)
	{
		//Integer Palindromes
		LinkedList l = new LinkedList();
		l.append(1);
		l.append(2);
		l.append(1);
		boolean palindrome = isPalindrome(l);
		System.out.println(palindrome);
	}
	
	static boolean isPalindrome(LinkedList l)
	{
		Stack stack = new Stack();
		Node curr = l.top();
		for (int i = 0; i < l.length()/2; i++)
		{
			stack.push(curr.val);
			curr = curr.next;
		}
		
		if (l.length()% 2 != 0)
		{
			curr = curr.next;
		}
		
		for (int j = 0; j < l.length()/2; j++)
		{
			if (stack.pop() != curr.val)
				return false;
			curr = curr.next;
		}
		
		return true;
	}
}
