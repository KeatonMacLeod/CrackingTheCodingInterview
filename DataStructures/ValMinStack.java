//KeatonMacLeod
package DataStructures;

public class ValMinStack {
	
	ValMinNode top;
	ValMinNode last;
	int numItems;
	
	public ValMinStack()
	{
		top = null;
		last = null;
		numItems = 0;
	}
	
	public void push(int val)
	{
		ValMinNode newNode;
		if (numItems == 0)
		{
			newNode = new ValMinNode(val,val);
			top = newNode;
			last = newNode;
		}
		else
		{
			if (val < last.min)
			{
				newNode = new ValMinNode(val,val);
			}
			else
			{
				newNode = new ValMinNode(val,last.min);
			}
		}
		numItems++;
		newNode.next = null;
		newNode.prev = last;
		last = newNode;
	}
	
	public int pop()
	{
		numItems--;
		ValMinNode curr = last;
		last = last.prev;
		return curr.val;
	}
	
	public int min()
	{
		return last.min;
	}
}
