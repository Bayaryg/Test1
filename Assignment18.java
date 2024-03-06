package javaassignments;
interface Country
{
	void city1();
	void city2();	
}
abstract class City implements Country
{
	abstract void village1();
	abstract void village2();	
	static void village3()
	{
		System.out.println("This is concrete method in abstract class");
	}
}
public class Assignment18 extends City
{	
	static void village4()
	{
		System.out.println("This is concrete method in subclass ");
	}
	public static void main(String[] args) {
		Assignment18 a1=new Assignment18();
		a1.city1();
		a1.city2();
		a1.village1();
		a1.village2();
		village4();
		village3();
	}	
	public void city1() {		
		System.out.println("This is abstract method1 in interface ");
	}	
	public void city2() {
		System.out.println("This is abstract method2 in interface ");
	}	
	void village1() {		
		System.out.println("This is abstract  method1 in abstract class ");
	}	
	void village2() {
		System.out.println("This is abstract  method2 in abstract class ");
	}
}
