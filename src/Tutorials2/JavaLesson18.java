package Tutorials2;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import static java.util.concurrent.TimeUnit.*;

public class JavaLesson18
{

	public static void main(String[] args) throws InterruptedException
	{
		addThreadsToPool();

	}
	
	public static void addThreadsToPool() throws InterruptedException
	{
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
		
		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, SECONDS);
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"), 10, 10, SECONDS);
		
//		System.out.println("Number of Threads: " + Thread.activeCount());
//		
//		Thread[] listOfThreads = new Thread[Thread.activeCount()];
//		
//		Thread.enumerate(listOfThreads);
//		
//		for(Thread i : listOfThreads)
//		{
//			System.out.println("W¹tek: " + i.getName());
//		}
//		
//		for(Thread i : listOfThreads)
//		{
//			System.out.println("Priorytet: " + i.getPriority());
//		}
		
		Thread.sleep(1);
		
		
		try
		{
			Thread.sleep(1);
		}
		catch(InterruptedException e)
		{}
		
		//eventPool.shutdown();
		
		
	}

}
