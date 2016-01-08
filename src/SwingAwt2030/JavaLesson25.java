package SwingAwt2030;

import javax.swing.*;

import java.awt.event.*;

public class JavaLesson25 extends JFrame
{
	JButton button1;
	String infoOnComponent = "";
	JList favoriteMovies, favoriteColors;
	DefaultListModel defListModel = new DefaultListModel();
	JScrollPane scroller;
	
	public static void main(String[] args)
	{
		
		new JavaLesson25();
		
	}
	
	public JavaLesson25()
	{
		this.setSize(400,400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Fifth Frame");
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton("Get Answer");
		
		ListenForButtons lForButton = new ListenForButtons();
		
		button1.addActionListener(lForButton);
		
		thePanel.add(button1);
		
		String[] movies = {"Matrix", "Minority Report", "Big"};
		
		favoriteMovies = new JList(movies);
		
		favoriteMovies.setFixedCellHeight(30);
		
		favoriteMovies.setFixedCellWidth(150);
		
		favoriteMovies.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		String[] colors = {"Black", "Blue", "White", "Green", "Orange", "Gray"};
		
		for(String color: colors)
		{
			defListModel.addElement(color);
		}
		
		defListModel.add(2, "Purple");
		
		favoriteColors = new JList(defListModel);
		
		favoriteColors.setVisibleRowCount(4);
		
		scroller = new JScrollPane(favoriteColors, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		favoriteColors.setFixedCellHeight(30);
		
		favoriteColors.setFixedCellWidth(150);
		
		thePanel.add(favoriteMovies);
		
		thePanel.add(scroller);
		
		this.add(thePanel);
		
		this.setVisible(true);
		
		
	}
	
	private class ListenForButtons implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==button1)
			{
				if(defListModel.contains("Black")) infoOnComponent += "Black is Here\n";
				
				if(!defListModel.isEmpty()) infoOnComponent += "Isn't empty\n";
				
				infoOnComponent += "Elemnets in the List " + defListModel.size() + "\n";
				
				infoOnComponent += "Last Element " + defListModel.lastElement() + "\n";
				
				infoOnComponent += "First Element " + defListModel.firstElement() + "\n";
				
				infoOnComponent += "In Index 1" + defListModel.get(1) + "\n";
				
				defListModel.remove(0);
				
				defListModel.removeElement("Big");
				
				Object[] arrayOfList = defListModel.toArray();
				
				for(Object color : arrayOfList)
				{
					infoOnComponent += color + "\n";
				}
					
				JOptionPane.showMessageDialog(JavaLesson25.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);
				
				infoOnComponent = "";
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
