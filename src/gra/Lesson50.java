package gra;

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import java.util.ArrayList;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import java.util.concurrent.TimeUnit;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Lesson50 extends JFrame
{

	public static int boardWidth = 1000;
	public static int boardHeight = 800;

	public static void main(String[] args)
	{
		new Lesson50();
	}

	public Lesson50()
	{

		this.setSize(boardWidth, boardHeight);
		this.setTitle("Java Asteroids");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameDrawingPanel gamePanel = new GameDrawingPanel();
		this.add(gamePanel, BorderLayout.CENTER);
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);
		executor.scheduleAtFixedRate(new RepaintTheBoard(this), 0L, 20L, TimeUnit.MILLISECONDS);
		this.setVisible(true);
	}

}

class RepaintTheBoard implements Runnable
{

	Lesson50 theBoard;

	public RepaintTheBoard(Lesson50 theBoard)
	{
		this.theBoard = theBoard;
	}

	@Override
	public void run()
	{
		theBoard.repaint();
	}
}

@SuppressWarnings("serial")
class GameDrawingPanel extends JComponent
{

	public ArrayList<Rock> rocks = new ArrayList<Rock>();

	int[] polyXArray = Rock.sPolyXArray;
	int[] polyYArray = Rock.sPolyYArray;

	int width = Lesson50.boardWidth;
	int height = Lesson50.boardHeight;

	public GameDrawingPanel()
	{
		for (int i = 0; i < 50; i++)
		{

			int randomStartXPos = (int) (Math.random() * (Lesson50.boardWidth - 40) + 1);
			int randomStartYPos = (int) (Math.random() * (Lesson50.boardHeight - 40) + 1);

			rocks.add(new Rock(Rock.getpolyXArray(randomStartXPos), Rock.getpolyYArray(randomStartYPos), 13, randomStartXPos, randomStartYPos));
		}
	}

	public void paint(Graphics g)
	{

		Graphics2D graphicSettings = (Graphics2D) g;

		graphicSettings.setColor(Color.BLACK);
		graphicSettings.fillRect(0, 0, getWidth(), getHeight());

		graphicSettings.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		graphicSettings.setPaint(Color.WHITE);

		for (Rock rock : rocks)
		{
			rock.move();
			graphicSettings.draw(rock);
		}

	}

}