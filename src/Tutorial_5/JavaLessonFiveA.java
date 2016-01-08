package Tutorial_5;

public class JavaLessonFiveA
{
	static double myPI = 3.14159; // Class Varieable 
	
	public static void main(String[] args)
	{
		
		addThem(1,2);
		System.out.println("Global " + myPI);
		
	}
	
	public static int addThem(int a, int b)
	{
		double smallPI = 3.140; 
		
		double myPI=3.0;
		
		System.out.println("Local " + myPI);
		return 1;
	}

}
