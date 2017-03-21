//KeatonMacLeod
package DataStructures;

public class Queue {
	Stack one;
	Stack two;
	int numItems;
	
	public Queue()
	{
		one = new Stack();
		two = new Stack();
		numItems = 0;
	}
	
	public void enter (int value)
	{
		one.push(value);
		numItems++;
	}
	
	public int leave ()
	{
		int valueOne = 0;
		int valueTwo = 0;
		
		while (!one.isEmpty())
		{
			valueOne = one.pop();
			if (!one.isEmpty())
			two.push(valueOne);
		}
		
		while (!two.isEmpty())
		{
			valueTwo = two.pop();
			one.push(valueTwo);
		}
		
		numItems--;
		return valueOne;
	}
	
	public int getNumItems()
	{
		return numItems;
	}
	
	public int front()
	{
		return one.top();
	}
	
	public boolean isEmpty()
	{
		return one.isEmpty();
	}
}