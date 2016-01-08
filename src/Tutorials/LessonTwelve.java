package Tutorials;

import java.util.LinkedList;
import java.util.Arrays;

public class LessonTwelve
{

	public static void main(String[] args)
	{
		LinkedList linkedListOne = new LinkedList();
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Ahmed Bannani");
		names.add("Ali Syed");
		
		names.addLast("Nathan Martin");
		
		names.addFirst("Joshua Smith");
		
		names.add(0, "Noah Peeters");
		
		names.set(2, "Pautl Newman");
		
		names.remove(4);
		names.remove("Joshua Smith");
		
		for (String name : names)
		{
			System.out.println(name);
		}

		System.out.println("\nFirstIndex: " + names.get(0));
		
		System.out.println("\nLasttIndex: " + names.getLast());
		
		LinkedList<String> nameCopy = new LinkedList<String>(names);
		
		System.out.println("\nnameCopy : " + nameCopy);
		
		if(names.contains("Noah Peeters"))
		{
			System.out.println("\nNoahs Here");
		}
		
		if(names.containsAll(nameCopy))
		{
			System.out.println("\nCollections the Same");
		}
		
//		System.out.println("\nAlli index at: " + names.lastIndexOf("Ali Syed"));
//		
//		System.out.println("\nList Empty: " + names.isEmpty());
//		
//		System.out.println("\nHow Many: " + names.size());
//		
//		System.out.println("\nLook without Error: " + names.peek());
//		
//		System.out.println("\nremove first elemnt: " + nameCopy.poll());
//		System.out.println("\nremove last elemnt: " + nameCopy.pollLast());
		
		nameCopy.push("Noah Peeters");
		nameCopy.pop();
		
		System.out.println();
		for(String name : nameCopy)
		{
			System.out.println(name);
		}
		
		Object[] nameArray = new Object[4];
		nameArray = names.toArray();
		
		System.out.println(Arrays.toString(nameArray));
		
		names.clear();
	}

}
