package javaassignments;
class SuperMost1
{
	void max()
	{
		System.out.println("This is supermost concrete method 1");
	}
	void min()
	{
		System.out.println("This is supermost concrete method 2");
	}
}
abstract class Super10 extends SuperMost1
{
	abstract void add();
	abstract void sub();
	void mult()
	{
		System.out.println("This is super concrete method 1");
	}
	void div()
	{
		System.out.println("This is super concrete method 2");
	}
}
public class Assignment16 extends Super10{
    void add() {		
	System.out.println("Thisis super class abstract method1");	//abs implementation
	}
	void sub() {
    System.out.println("Thisis super class abstract method2"); //abs implementation
	}	
	void sum()
	{
		System.out.println("Thisis sub class concrete method1");//concrete method
	}
	void avg()
	{
		System.out.println("Thisis sub class concrete method2");//concrete method
	}
	public static void main(String[] args) {
		Assignment16 a1=new Assignment16();
		a1.max();
		a1.min();
		a1.add();
		a1.sub();
		a1.mult();
		a1.div();
		a1.avg();
		a1.sum();
        a1.concat();
        a1.length();
	}
	void concat()
	{
		System.out.println("this is concrete method 1 child");
	}	
	
	void length()
	{
		System.out.println("this is concrete method 2 child");
	}

}
