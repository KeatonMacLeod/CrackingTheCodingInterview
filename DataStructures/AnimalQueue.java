package DataStructures;

public class AnimalQueue {
	public AnimalNode top;
	public AnimalNode last;
	public int numItems;
	
	public AnimalQueue()
	{
		top = null;
		last = null;
		numItems = 0;
	}
	
	public AnimalNode top()
	{
		return top;
	}
	
	public void enter(int type)
	{
		AnimalNode newNode = new AnimalNode(type, null);
		if (top == null)
		{
			top = newNode;
			last = newNode;
		}
		else
		{
			last.next = newNode;
			last = newNode;
		}
		numItems++;
	}
	
	public int leave()
	{
		int val = Integer.MIN_VALUE;
		if (numItems != 0)
		{
			val = top.id;
			top = top.next;
		}
		numItems--;
		return val;
	}
	
	public boolean isEmpty()
	{
		return top == null;
	}
	
	public int getNumItems()
	{
		return numItems;
	}
}
