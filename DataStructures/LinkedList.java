//KeatonMacLeod
package DataStructures;

public class LinkedList {

	Node top;
	
	public LinkedList()
	{
		top = null;
	}
	
	public Node top()
	{
		return top;
	}
	
	//Inserts at the front of the list
    public Node insert(int value)
    {
      Node node = new Node(value, top);
      top = node;
      return node;
    }
    
    public void insertNode (Node node)
    {
    	node.next = top;
    	top = node;
    }
    
    //Takes the last node and links it to the first node
    public void makeCircular()
    {
    	Node prev = null;
    	Node curr = top;
    	while (curr != null)
    	{
    		prev = curr;
    		curr = curr.next;
    	}
    	prev.next = top;
    }
    
    public int length ()
    {
    	Node curr = top;
    	int length = 0;
    	while (curr != null)
    	{
    		curr = curr.next;
    		length++;
    	}
    	return length;
    }
    
    public Node append (int value)
    {
    	Node node = new Node(value, null);
    	
    	if (top == null)
    	{
    		top = node;
    	}
    	else
    	{
        	Node prev = null;
        	Node curr = top;
        	while (curr != null)
        	{
        		prev = curr;
        		curr = curr.next;
        	}
        	prev.next = node;
    	}

    	return node;
    }
    
    public void print()
    {
    	Node curr = top;
    	System.out.print("[");
    	while (curr != null)
    	{
    		if (curr.next != null)
    		System.out.print(curr.val + ", ");
    		else
			System.out.println(curr.val + "]");
    		curr = curr.next;
    	}
    }
}
