//KeatonMacLeod
package DataStructures;

class StackNode
{
   public Stack stack;
   public StackNode next;
   public StackNode prev;

   public StackNode (Stack stack, StackNode next)
   {
      this.stack = stack;
      this.next = next;
   }
   
   public StackNode (Stack stack, StackNode next, StackNode prev)
   {
	  this.stack = stack;
	  this.next = next;
	  this.prev = prev;
   }
   
}
