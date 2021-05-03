//Ethan Yu (not you, me!)

public class Town extends java.lang.Object implements java.lang.Comparable<Town> 
{
	String name;
	public int hashcode;
	
	public Town(String name) 
	{
		this.name = name;
	}
	
	public Town(Town templateTown) 
	{
		this.name = templateTown.name;
	}

	public java.lang.String getName()
	{
		return name;
	}
	
	@Override
	public int compareTo(Town o) 
	{
		if (this.name.equals(o.name))
		{
			return 0;
		}else 
		{
			return 1;
		}
	}
	
	public java.lang.String toString()
	{
		return this.name;
	}
	
	public int hashCode()
	{
		return this.hashcode;
	}
	
	public boolean equals(java.lang.Object obj)
	{
		Town o = (Town)obj;
		
		if(obj == null) 
		{
			return false;
		}
		if(!(obj instanceof Town)) 
		{
			return false;
		}
		if (this.name.equals(o.name))
		{
			return true;
		}else 
		{
			return false;
		}
	}
}