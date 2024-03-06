package javaassignments;
class SuperMost
{    
	void min()
	{
		System.out.println("This is Supermostclass minimum method");
	}	
	void max()
	{
		System.out.println("This is Supermostclass maximum method");
	}
}
class Super extends SuperMost
{	
	static void up()
	{
		System.out.println("This is Superclass up method");
	}	
	static void down()
	{
		System.out.println("This is Superclass down method");
	}
}
public class Assignment13 extends Super{	
	void sum()
	{
		System.out.println("This is subclass sum method");
	}
	void diff()
	{
		System.out.println("This is subclass diff method");
	}
	public static void main(String[] args) {		
		up();
		down();
		Assignment13 a2=new Assignment13();
		a2.max();
		a2.min();
		a2.diff();
		a2.sum();
	}

}
