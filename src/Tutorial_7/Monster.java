package Tutorial_7;

public class Monster
{
	public final String TOMBSTONE = "Here Lies a Dead monster";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	
	public String name = " Big Monster";
	
	public int getAttack()
	{
		return attack;
	}
	
	public int getMovement()
	{
		return movement;
	}
	
	public int getxPosition()
	{
		return xPosition;
	}

	public void setxPosition(int xPosition)
	{
		this.xPosition = xPosition;
	}

	public int getyPosition()
	{
		return yPosition;
	}

	public void setyPosition(int yPosition)
	{
		this.yPosition = yPosition;
	}

	public boolean isAlive()
	{
		return alive;
	}

	public void setAlive(boolean alive)
	{
		this.alive = alive;
	}

	public void setAttack(int attack)
	{
		this.attack = attack;
	}

	public void setMovement(int movement)
	{
		this.movement = movement;
	}

	public int getHealth()
	{
		return health;
	}
	
	public void setHealth(int decreaseHealth)
	{
		health = health - decreaseHealth;
		if (health <= 0 )
		{
			alive = false;
		}
	}
	
	public void setHealth(double decrease)
	{
		int intDecreaseHealth = (int) decrease;
		health = health - intDecreaseHealth;
		if (health <= 0 )
		{
			alive = false;
		}
	}
	
	public Monster(int health, int attack, int movement)
	{
		this.health = health;
		this.attack = attack;
		this.movement = movement;
	}
	
	public Monster()
	{
		
	}
	
	
	public static void main(String[] args)
	{
		Monster Frank = new Monster();
		
		System.out.println(Frank.attack);

	}

}
