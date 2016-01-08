package Tutorial_4;

import java.util.Scanner;

public class JavaLessonFourB
{
	static Scanner userinput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		String contYourN = "Y";
		
		int h = 1;
		
		while (contYourN.equalsIgnoreCase("y"))
		{
			System.out.println(h);
			System.out.println("Continue y or n");
			contYourN = userinput.nextLine();
			h++;
			
		}

	}

}
