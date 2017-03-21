//KeatonMacLeod
package LinkedLists;
import java.util.Random;

import DataStructures.LinkedList;
import DataStructures.Node;

public class L25 {
	
	public static void main (String[] args)
	{
		Random random = new Random();
		LinkedList l = new LinkedList();
		
		//Only max of 4, because 5 can cause a "carry"
		int max = 4;
		int min = 1;
		int numDigits = 3;
		
		for (int i = 0; i < numDigits; i++)
		{
			int value = random.nextInt(max - min + 1) + min;
			l.insert(value);
		}
		
		//Appears as 43 in the list
		l.insert('+');
		
		for (int i = 0; i < numDigits; i++)
		{
			int value = random.nextInt(max - min + 1) + min;
			l.insert(value);
		}
		
		System.out.println("BEFORE");
		l.print();
		System.out.println("AFTER");
		LinkedList newList = sumList(l);
		newList.print();
	}
	
	static LinkedList sumList (LinkedList l)
	{
		Node curr = l.top();
		int[] vals = new int [l.length()];
		int i;
		for (i = 0; curr.val != '+'; i++)
		{
			vals[i] = curr.val;
			curr = curr.next;
		}
		
		curr = curr.next; //Advance past the + sign
		boolean carry = false;
		LinkedList newList = new LinkedList();
		int sum = 0;

		for (int j = 0; j < i; j++)
		{
			if (carry)
			{
				sum = curr.val + vals[j] + 1;
				carry = false;
			}
		
			else
			{
				sum = curr.val + vals[j];
			}
			
			if (sum >= 10)
			{
				carry = true;
				sum = sum%10;
			}
		
			newList.append(sum);
			curr = curr.next;
		}//for
		return newList;
		}//sumList
	}
