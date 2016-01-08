package Tutorials;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;


public class LessonEleven
{

	public static void main(String[] args)
	{
		
		ArrayList arrayListOne;
		
		arrayListOne = new ArrayList();
		
		ArrayList arrayListoTwo = new ArrayList();
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("John Smith");
		names.add("Mohamed Alami");
		names.add("Oliver Miller");
		
		names.add(2, "Jack Ryan");

		names.set(0, "John Adams");
		
//		names.remove(3);
		
		for(int i=0; i< names.size();	i++)
		{
			System.out.println(names.get(i));
		}
		System.out.println();
		
		System.out.println(names);
		System.out.println();
		
		for (String i : names)
		{
			System.out.println(i);
		}
		
		
		System.out.println();
		
		
		
		Iterator indivItems = names.iterator();
		while(indivItems.hasNext())
		{
			System.out.println(indivItems.next());
		}
		System.out.println();
		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		nameCopy.addAll(names);
		System.out.println(nameCopy);
		System.out.println();
		
		String paulYoung = "Poul Young";
		names.add(paulYoung);
		if(names.contains(paulYoung))
		{
			System.out.println("Paul is here");
		}
		
		if (names.containsAll(nameCopy))
		{
			System.out.println("Everything in nameCopy is in names");
		}
		
		names.clear();
		
		if(names.isEmpty())
		{
			System.out.println("ArrayList is Empty");
		}
		
		Object[] moreNames = new Object[4];
		moreNames = nameCopy.toArray();
		System.out.println(Arrays.toString(moreNames));
		
		
		
		
		
		
		
		
		

	}

}
