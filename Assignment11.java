package javaassignments;
import java.util.Scanner;
public class Assignment11 {
	
	static void add()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter value of a");
		int a=s1.nextInt();
		System.out.println("enter value of b");
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("Sum of a and b is "+sum);		
	}	
	static void sub()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter value of a");
		int a=s1.nextInt();
		System.out.println("enter value of b");
		int b=s1.nextInt();
		int sub=a-b;
		System.out.println("sub of a and b is "+sub);		
	}
	 void multiply()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter value of a");
		int a=s1.nextInt();
		System.out.println("enter value of b");
		int b=s1.nextInt();
		int mul=a*b;
		System.out.println("mul of a and b is "+mul);
		s1.close();
	}
	 void divide()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter value of a");
		int a=s1.nextInt();
		System.out.println("enter value of b");
		int b=s1.nextInt();
		int div=a/b;
		System.out.println("div of a and b is "+div);			
	}
	public static void main(String[] args) {		
		add();
		sub();		
		Assignment11 a1=new Assignment11();		
		a1.divide();
		a1.multiply();
	}

}
