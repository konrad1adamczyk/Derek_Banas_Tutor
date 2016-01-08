package Tutorials4;

import java.io.*;

import javax.swing.*;

public class JavaLesson31 extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static String filePath, parentDirectory;

	static File randomDir, randomFile, randomFile2;

	public static void main(String[] args)
	{

		// Creates a File object in memory

		randomDir = new File("C:/Users/Konrad/Documents/workspace3/Java Code/Random");

		randomDir.mkdir();

		randomFile = new File("random.text");

		randomFile2 = new File("C:/Users/Konrad/Documents/workspace3/Java Code/Random/random.txt");

		try
		{
			randomFile.createNewFile();

			randomFile2.createNewFile();

			filePath = randomFile.getCanonicalPath();

		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		if (randomFile2.exists())
		{
			System.out.println("File Exists");
			
			System.out.println("File Readable " + randomFile2.canRead());
			
			System.out.println("File Writable " + randomFile2.canWrite());
			
			System.out.println("File Location " + randomFile2.getPath());
			
			System.out.println("File Name " + randomFile2.getName());
			
			System.out.println("Parent Directory " + randomFile2.getParent());
			
			
			String[] filesInDir = randomDir.list();
			System.out.println("Files in directory\n" );
			for(String fileName : filesInDir)
			{	
				System.out.println(fileName + "\n");
			}
			
			
			System.out.println("Is a File " + randomFile2.isFile());
			
			System.out.println("Is hidden " + randomFile2.isHidden());
			
			System.out.println("Is hidden " + randomFile2.isHidden());
			
			System.out.println("Last modified " + randomFile2.lastModified());
			
			System.out.println("File Size " + randomFile2.length());
			
			randomFile2.renameTo(new File("C:/Users/Konrad/Documents/workspace3/Java Code/Random/random3.txt"));
			
			new JavaLesson31();
						
		} 
		else 
		{
			System.out.println("File doesn't exist");
		}
		//---------------------------------------------------------
		if(randomFile2.delete())
		{
			System.out.println("File Deleted");
		}
		
		File[] filesInDir = randomDir.listFiles();
		
		for(File fileName : filesInDir)
		{
			fileName.delete();
		}
		
		if(randomFile2.delete())
		{
			System.out.println("File Deleted");
		}
		
		if(randomDir.delete())
		{
			System.out.println("Directory Deleted");
		}

	}    	// END of main

	public JavaLesson31(){
		
		JFileChooser fileChooser = new JFileChooser(randomDir);
		
		fileChooser.showOpenDialog(this);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}