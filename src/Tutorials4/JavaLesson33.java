//I completely cover reading and writing Java Binary Streams.
//
//I cover everything you need to know including DataOutputStream, FileOutputStream, BufferedOutputStream, 
//all of the reading and writing primitive type methods and more.

package Tutorials4;

import java.io.*;

public class JavaLesson33
{
	
	
	public static void main(String[] args)
	{
		Customer[] customers = getCustomers();
		
		DataOutputStream custOutput = createFile("C:/java/customers.dat");
		
		for(Customer person : customers)
		{
			createCustomers(person, custOutput);
		}
		
		try
		{
			custOutput.close();
		}
		catch(IOException e)
		{
			System.out.println("I/O Error");
			System.exit(0);
		}
		
		getFileInfo();
		

	} //End of main
	
	private static class Customer
	{
		public String custName;
		public int custAge;
		public double custDebt;
		public boolean oweMoney;
		public char custSex;
		
		public Customer (String custName, int custAge, double custDebt, boolean oweMoney, char custSex)
		{
			this.custName = custName;
			this.custAge = custAge;
			this.custDebt = custDebt;
			this.oweMoney = oweMoney;
			this.custSex = custSex;
		}
		
	}
	
	private static Customer[] getCustomers()
	{
		Customer[] customers = new Customer[5];
		
		customers[0] = new Customer("Jochn Smith", 21, 12.25, true, 'M');
		customers[1] = new Customer("Paul Smith", 21, 12.25, true, 'M');
		customers[2] = new Customer("Sue Smith", 21, 12.25, true, 'M');
		customers[3] = new Customer("Sally Smith", 21, 12.25, true, 'M');
		customers[4] = new Customer("Mark Smith", 21, 12.25, true, 'M');
		
		return customers;
	}
	
	private static DataOutputStream createFile(String fileName)
	{
		try
		{
			File listOfNames = new File(fileName);
			
			DataOutputStream infoToWrite = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(listOfNames)));
			
			return infoToWrite;
		}
		catch(IOException e)
		{
			System.out.println("I/O Error");
			System.exit(0);
		}
		
		return null;
	} // End of createFile 
	
	private static void createCustomers(Customer customer, DataOutputStream custOutput)
	{
		try 
		{
			custOutput.writeUTF(customer.custName);
			
			custOutput.writeInt(customer.custAge);
			
			custOutput.writeDouble(customer.custDebt);
			
			custOutput.writeBoolean(customer.oweMoney);
			
			custOutput.writeChar(customer.custSex);
		}
		catch(IOException e)
		{
			System.out.println("I/O Error");
			System.exit(0);
		}
	} // End of createCustomers 
	
	private static void getFileInfo()
	{
		System.out.println("Info Written to File");
		
		File listOfNames = new File("C:/java/customers.dat");
		
		boolean eof = false;
		
		try
		{
			DataInputStream getInfo = new DataInputStream(new BufferedInputStream(new FileInputStream(listOfNames)));
			
			while(!eof)
			{
				String custName = getInfo.readUTF();
				int custAge = getInfo.readInt();
				double custDebt = getInfo.readDouble();
				boolean oweMoney = getInfo.readBoolean();
				char custSex = getInfo.readChar();
				
				System.out.println(custName);
				System.out.println(custAge);
				System.out.println(custDebt);
				System.out.println(oweMoney);
				System.out.println(custSex);
				
			}
		} // End of try
		catch(EOFException e)
		{
			eof = true;
		}
		catch(FileNotFoundException e)
		{
			System.out.println("No File");
			System.exit(0);
		}
		catch(IOException e)
		{
			System.out.println("I/O Error");
			System.exit(0);
		}
		
	}
	
	
	
	

} //End of class javaLesson33 
