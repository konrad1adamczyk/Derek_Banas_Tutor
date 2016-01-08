package Tutorials2;

public class JavaLesson15
{

	public static void main(String[] args)
	{
		Vehicle car = new Vehicle(4,100.00);
		
		System.out.println("Cars Max Speed is : " + car.getSpeed());
		System.out.println("Num of wheels " + car.getWheels());
		
		car.setCarStrength(10);
		System.out.println("Strength: " + car.getCarStrength());

	}

}
