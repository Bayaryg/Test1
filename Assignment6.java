package javaassignments;


public class Assignment6 {
	
	public static void main(String[] args) {
		
		System.out.println("main method");
        test1();
        Assignment6 s1=new Assignment6();
        s1.test2();
	}
	
	static void test1()
	{
		System.out.println("this is static method");
	}
	void test2()
	{
		System.out.println("this is non static method");
	}

}
