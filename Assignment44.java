package javaassignments;
public class Assignment44 {
	public static void main(String[] args) {
		String name[]= {"Archana","Abhishek","Athryea","Janhavi", "Aditya"};
		int rollno[]= {3,1,5,2,4};
		double salary[]= {10000,20000,15500,80500,92000};		
		System.out.println("************Assignment 39B***********");				
		for(int i=0;i<=name.length;i++)		{
			try {
			System.out.print(name[i]);
			System.out.print(rollno[i]);
			System.out.println(salary[i]);
			}
			catch (ArrayIndexOutOfBoundsException a1)			{
				System.out.println("Exception handled at 39B");
			}		}		
		System.out.println("************Assignment 39C***********");		
		for(int i=0;i<=name.length;i++)		{
			try {
			System.out.println(name[i]);
			System.out.println(rollno[i]);
			System.out.println(salary[i]);
			}
			catch (ArrayIndexOutOfBoundsException a2)			{
				System.out.println("Exception handled at 39C");
			}		}		
		System.out.println("************Assignment 39A***********");		
		for(int i=0;i<=name.length;i++)			
		{
			try {
			System.out.print(name[i]+" ");
			System.out.print(rollno[i]+" ");
			System.out.println(salary[i]);
			}
			catch (ArrayIndexOutOfBoundsException a3)
			{
				System.out.println("Exception handled at 39A");
			}
		}		

	}

}
