//KeatonMacLeod
package DataStructures;

public class Stack {
	
	Node top;
	Node last;
	int numItems;
	int maxSize;
	
	public Stack()
	{
		top = null;
		last = null;
		numItems = 0;
	}
	
	public void push(int val)
	{
		Node newNode;
		if (top == null)
		{
			newNode = new Node(val, null, null);
			top = newNode;
			last = newNode;
		}
		else
		{
			newNode = new Node(val, null, last);
			last.next = newNode;
			last = newNode;
		}
		numItems++;
	}
	
	public int pop()
	{
		int value = Integer.MIN_VALUE;
		if (numItems == 1)
		{
			value = last.val;
			last = null;
			top = null;
			numItems--;
		}
		if (numItems > 1)
		{
			value = last.val;
			last = last.prev;
			numItems--;
		}
		return value;
	}
	
	public int getNumItems()
	{
		return numItems;
	}
	
	public int top()
	{
		return top.val;
	}
	
	public boolean isEmpty()
	{
		return numItems == 0;
	}
	
}
