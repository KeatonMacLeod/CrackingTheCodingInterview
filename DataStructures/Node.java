//KeatonMacLeod
package DataStructures;

public class Node
{
   public int val;
   public Node next;
   public Node prev;

   public Node (int data, Node next)
   {
      this.val = data;
      this.next = next;
   }
   
   public Node (int data, Node next, Node prev)
   {
	  this.val = data;
	  this.next = next;
	  this.prev = prev;
   }
   
}
