package javaassignments;
class Parent1
{
	static void add()
	{
		System.out.println("This is Parent static method1");
	}	
	static void sub()
	{
		System.out.println("This is Parent static method2");
	}	
	void div()
	{
		System.out.println("This is Parent nonstatic method1");
	}
	void mult()
	{
		System.out.println("This is Parent nonstatic method2");
	}
}
public class Assignment12 extends Parent1{	
	void pass()
	{
		System.out.println("This subclass is nonstatic method1");
	}
	void fail()
	{
		System.out.println("This is subclass nonstatic method2");
	}
	public static void main(String[] args) {		
		add();
		sub();
		Assignment12 a1=new Assignment12();
		a1.div();
		a1.mult();
		a1.pass();
		a1.fail();
	}

}
