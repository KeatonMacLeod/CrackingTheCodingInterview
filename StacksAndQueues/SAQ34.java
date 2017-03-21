//KeatonMacLeod
package StacksAndQueues;
import java.util.Random;
import DataStructures.Queue;

public class SAQ34 {

	public static void main (String[] args)
	{
		
		Random random = new Random();
		Queue queue = new Queue();
		int max = 10;
		int min = 1;
		
		for (int i = 0; i < 10; i++)
		{
			int value = random.nextInt(max - min + 1) + min;
			System.out.println("Entering: " + value);
			queue.enter(value);
		}//for
		
		while (!queue.isEmpty())
		{
			System.out.println(queue.leave());
		}//while

	}
}