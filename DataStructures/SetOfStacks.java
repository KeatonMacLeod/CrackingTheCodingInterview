//KeatonMacLeod
package DataStructures;

public class SetOfStacks {
	StackNode top;
	StackNode curr;
	int numItems;
	int maxSize;
	
	public SetOfStacks()
	{
		top = null;
		curr = null;
		numItems = 0;
		maxSize = 4;
	}
	
	public void push (int val)
	{
		if (top == null && curr == null)
		{
			top = new StackNode(new Stack(), null);
			curr = top;
			curr.stack.push(val);
			
		}
		else if (curr.stack.numItems == maxSize)
		{
			curr.next = new StackNode(new Stack(), null);
			StackNode placeHolder = curr;
			curr = curr.next;
			curr.prev = placeHolder;
			curr.stack.push(val);
		}
		else
		{
			curr.stack.push(val);
		}
		numItems++;
	}//push
	
	public int pop()
	{
		if (curr.stack.numItems == 0)
		{
			curr = curr.prev;
		}
		return curr.stack.pop();
	}
}
