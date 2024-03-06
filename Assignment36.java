package javaassignments;

public class Assignment36 {

	public static void main(String[] args) {
		int add[]= {1,2,3,-4,-5};
		int total=0;
		
		for(int i=0;i<=add.length-1;i++)
		{
			total=total+add[i];
		}
		System.out.println("total value of positive and negative numbers are "+total);

	}

}
