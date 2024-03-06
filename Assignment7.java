package javaassignments;

public class Assignment7 {

	public static void main(String[] args) {
		
		int age=85;
		char gender ='M';
		
		if (age>=18)
		{
		  if (age>=65)
		  {
			  if(gender=='F')
			  {
				  System.out.println("you are a female senior citizen and have free ticket");  
			  }
			  else
			  {
				  System.out.println("you are a male senior citizen and have to pay 80% fee");  
			  }
		  }
		  else
		  {
			  System.out.println("you are an adult, pay half fee");
		  }
		}
		else {
			System.out.println("you are a student and have to apy half fee");
		}
	}



}
