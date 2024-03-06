package javaassignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment43 {

	public static void main(String[] args) {
     Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter integer value");
		try
		{
		int a=s1.nextInt();
		System.out.println("Test try print");
		}
		catch(InputMismatchException a1)
		{
		  System.out.println("Exception handled");
		}

	}

}
