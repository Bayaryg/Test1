package javaassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Scanner s1=new Scanner(System.in);
			
			int array1[]=new int[4];
			for(int i=0;i<array1.length;i++)
			{
				array1[i]=s1.nextInt();
			}
		
	assert array1.length == 5:"Condition statisfy";

	System.out.println(Arrays.toString(array1));

	}

}
