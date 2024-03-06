package javaassignments;

public class Assignment33 {

	public static void main(String[] args) {
		
		boolean condition[]=new boolean[2];//boolean
		condition[0]=true;
		condition[1]=false;
		
		for(int i=0;i<=condition.length-1;i++)
		{
			System.out.println(condition[i]);
		}
		
		double d1[]=new double[3];//double
		d1[0]= 4.3453;
		d1[1]=2.3412;
		d1[2]=46.1234;
		
		for(int i=0;i<=d1.length-1;i++)
		{
			System.out.println(d1[i]);
		}
		
		String s1[]=new String[1]; //String
		s1[0]="This is string array";
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.println(s1[i]);
		}
		
		char c1[]=new char[5];//Char
		c1[0]='A';
		c1[1]='B';
		c1[2]='C';
		c1[3]='D';
		c1[4]='E';
		for(int i=0;i<=c1.length-1;i++)
		{
			System.out.print(c1[i]);
		}
		
	}

}
