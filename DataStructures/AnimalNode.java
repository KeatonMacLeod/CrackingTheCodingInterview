//KeatonMacLeod
package DataStructures;

public class AnimalNode {

	public int type; //1 = cat, 2 = dog
	public int id;
	public AnimalNode next;
	public AnimalNode prev;
	
	public AnimalNode (int t, AnimalNode n)
	{
		type = t;
		next = n;
		id = CatDogQueue.animalID;
	}
   
}
