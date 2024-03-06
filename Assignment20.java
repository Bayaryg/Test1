package javaassignments;
interface Classroom1
{
    void bench();
  
	void desk();
}

abstract class Classroom2
{
	abstract void student1();
	abstract void student2();
	static void stundent3()
	{
		System.out.println("This is abstract class concrete method1");
	}
	static void stundent4()
	{
		System.out.println("This is abstract class concrete method2");
	}	
}
public class Assignment20 extends Classroom2 implements Classroom1{	
	void marks()
	{
		System.out.println("This is subclass  concrete method1");
	}
	void rank()
	{
		System.out.println("This is subclass  concrete method2");
	}	
	public static void main(String[] args) {		
		Assignment20 a1=new Assignment20();
		a1.bench();
		a1.desk();
		a1.student1();
		a1.student2();
		a1.marks();
		a1.rank();
		stundent3();
		stundent4();
	}	
	public void bench() 
	{		
		System.out.println("This is interface  abstract method1");
	}	
	public void desk() {		
		System.out.println("This is interface  abstract method2");
	}	
	void student1() {
		System.out.println("This is abstract class abstract method1");
	}	
	void student2() {	
		System.out.println("This is abstract class abstract method2");
	}


}
