package javaassignments;
class GrandFather
{
	void animal()
	{
		
	}
	}
class Father extends GrandFather
{
	void bird()
	{
		
	}
}
class Son extends Father
{
	void river()
	{
		
	}
}
public class Assignment48 extends Son{
	void phone()
	{
		
	}
	public static void main(String[] args) {
		//case5 class typecasting		
		Father f1=	new Son();//upcasting
		f1.animal();
		f1.bird();
		Son s1=(Son) f1;//downcasting
		s1.animal();
		s1.bird();
		s1.river();

	}

}
