package javaassignments;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s1= new Scanner(System.in);
		
		 System.out.println("Enter value of a");
         byte a= s1.nextByte();
         System.out.println("Enter value of b");
         short b=s1.nextShort();
         System.out.println("Enter value of c");
         int c=s1.nextInt();
         System.out.println("Enter value of d");
         long d=s1.nextLong();
         System.out.println("Enter value of e");
         float e=s1.nextFloat();
         System.out.println("Enter value of f");
         double f=s1.nextDouble();
         System.out.println("Enter value of g");
         String g=s1.next();//no InputMismatchException for String
         System.out.println("Enter value of h");
         boolean h=s1.nextBoolean();
         
         s1.close();
	}

}
