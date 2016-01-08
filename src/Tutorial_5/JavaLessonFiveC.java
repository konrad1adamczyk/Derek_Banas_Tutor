package Tutorial_5;

public class JavaLessonFiveC
{
	static double myPI = 3.14159; 
	
	public static void main(String[] args)
	{
		
		int d = 5;
		tryToChange(d);
		
		System.out.println("main d = " + d);
		
	}
	
	public static void tryToChange (int d)
	{
		d = d + 1;
		System.out.println("tryToChange d = " + d);
	}
	

}
