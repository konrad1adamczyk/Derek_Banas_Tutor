package Tutorials2;

import java.util.*;
import java.text.DateFormat;


public class GetTime20 extends Thread
{
	public void run()
	{
		Date rightNow;
		Locale currentLocale;
		DateFormat timeFormatter;
		DateFormat dateFormatter;
		String timeOutput;
		String dateOutput;
		
		for(int i=1; i<=15;i++)
		{
			rightNow = new Date();
			currentLocale = new Locale("pl");
			
			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
			dateFormatter = DateFormat.getDateInstance(DateFormat.LONG, currentLocale);
			
			timeOutput = timeFormatter.format(rightNow);
			dateOutput = dateFormatter.format(rightNow);
			
			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println();
			
			try 
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
			
		}
		
		
		
		
	}

}
