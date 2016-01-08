package SwingAwt2030;

import javax.swing.*;

import java.awt.event.*;
import java.awt.Dimension;
import java.util.Date;

import javax.swing.SpinnerDateModel;

import java.util.Calendar;

public class JavaLesson26 extends JFrame
{
	JButton button1;
	String outputString = "";
	JSpinner spinner1, spinner2, spinner3, spinner4;
		
	public static void main(String[] args)
	{
		
		new JavaLesson26();
		
	}
	
	public JavaLesson26()
	{
		this.setSize(400,400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Sixth Frame");
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton("Get Answer");
		
		ListenForButtons lForButton = new ListenForButtons();
		
		button1.addActionListener(lForButton);
		
		thePanel.add(button1);
		
		spinner1 = new JSpinner();
		
		thePanel.add(spinner1);
		
		spinner2 = new JSpinner(new SpinnerNumberModel(50, 1, 100, 1));
		
		thePanel.add(spinner2);
		
		String[] weekDays = {"Mon", "Tues", "Weds", "Thur", "Fri"};
		
		spinner3=new JSpinner(new SpinnerListModel(weekDays));
		
		Dimension d = spinner3.getPreferredSize();
		d.width = 80;
		spinner3.setPreferredSize(d);
		
		thePanel.add(spinner3);
		
		Date todaysDate = new Date();
		
		spinner4 = new JSpinner(new SpinnerDateModel(todaysDate, null, null, Calendar.DAY_OF_MONTH));
		
		JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinner4, "dd/MM/yy");		
		
		spinner4.setEditor(dateEditor);
		
		thePanel.add(spinner4);
		
		this.add(thePanel);
		
		this.setVisible(true);
		
	}
	
	
	
	
	private class ListenForButtons implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==button1)
			{
				outputString += "Spinner 1 Value:" + spinner1.getValue() + "\n";
				outputString += "Spinner 2 Value:" + spinner2.getValue() + "\n";
				outputString += "Spinner 3 Value:" + spinner3.getValue() + "\n";
				outputString += "Spinner 4 Value:" + spinner4.getValue() + "\n";
				
				JOptionPane.showMessageDialog(JavaLesson26.this, outputString, "Information", JOptionPane.INFORMATION_MESSAGE);
				
				outputString ="";
			}
		}
	}
	
}