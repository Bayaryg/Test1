package javaassignments;
import java.util.Scanner;
public class Assignment45 {
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);		
		System.out.println("Enter value of switch case a");
		int a=sc.nextInt();	
		System.out.println("Enter value of b");
		int b=sc.nextInt();
		System.out.println("Enter value of c");
		int c=sc.nextInt();
		
		switch(a)
		{
		case 1 : int sum=b+c; 
		         System.out.println("addition of b and c: "+sum);
		         break;
		case 2 : int sub=b-c; 
                 System.out.println("subtraction of b and c: "+sub);
                 break;
		case 3 : int mul=b*c; 
                 System.out.println("multiplication of b and c: "+mul);
                 break;
		case 4 : double div=b/c; 
                 System.out.println("division of b and c: "+div);
                 break;
        default: System.out.println("Selection out of range");        
		}
         sc.close();
	}

}
