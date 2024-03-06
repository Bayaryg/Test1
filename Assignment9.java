package javaassignments;

public class Assignment9 {
	
	static int a=10;
	static int b=20;
	
	static void add()
	{		
		System.out.println(a+b);
	}
	
	static void substract()
	{		
		System.out.println(a-b);
	}
	void multiply()
	{
		System.out.println(a*b);
	}
	void division()
	{
		System.out.println(b/a);
	}
	public static void main(String[] args) {
		
		Assignment9 a1=new Assignment9();		
		add();
	    substract();
		a1.multiply();
		a1.division();
		
		
	}

}
