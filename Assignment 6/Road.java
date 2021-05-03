//Ethan Yu (not you, me!)

public class Road extends java.lang.Object implements java.lang.Comparable<Road>
{

	Town source;
	Town destiny;
	String name;
	int weight;
	
	
	public Road(Town source, Town destination, int degrees, java.lang.String name) 
	{
		this.source = source;
		destiny = destination;
		weight = degrees;
		this.name = name;
	}

	
	public Road(Town source, Town destination, java.lang.String name) 
	{
		this.source = new Town(source);
		destiny = new Town(destiny);
		weight = 1;
		this.name = name;
	}
	
	public boolean contains(Town town) 
	{	
		if (source.getName().equals(town.getName()) || destiny.getName().equals(town.getName())) 
		{
			return true;
		}
		return false;
	}
	
	public java.lang.String toString()
	{
		return name;
		
	}
	
	public java.lang.String getName()
	{
		return this.name;
	}
	
	public Town getDestination()
	{
		return this.destiny;
	}
	
	public Town getSource()
	{
		return this.source;
	}
	
	public int compareTo(Road o)
	{
		
		if (this.name.equals(o.name))
		{
			return 0;
		}else 
		{
			return 1;
		}
		
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	@Override
	public boolean equals(java.lang.Object r)
	{
		Road o = (Road)r;

		if (this.destiny == o.destiny || this.destiny == o.source) 
		{
			if (this.destiny == o.destiny || this.destiny == o.source) 
			{
				return true;
			}
		}
		return false;
	}
	
}