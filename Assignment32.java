package javaassignments;

public class Assignment32 {

	public static void main(String[] args) {
		String input="malayalam";
		String output="";
		
		for (int i=input.length()-1;i>=0;i--)
		{
			output=output+input.charAt(i);
		
		}
		System.out.println(output);
		
		if (input.equals(output))
		{
			System.out.println("the string is palindrome");
		}
		else
		{
			System.out.println("the string is not a palindrome");
		}

	}

	}


