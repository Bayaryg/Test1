package javaassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment37 {

	public static void main(String[] args) {
		int arr1[]=new int[3];
		int arr2[]=new int[3];
		
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter value");
			arr1[i]=s1.nextInt();
		}
		for(int j=0;j<arr1.length;j++)
		{
			System.out.println("Enter value");
			arr2[j]=s1.nextInt();
		}		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.equals(arr1, arr2));

	}

}
