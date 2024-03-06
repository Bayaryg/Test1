package javaassignments;
public class Assignment41 {

	public static void main(String[] args) {
		
		int arr2[]= {2,1,9,4,6};
		double sum=0;
		
		for(int i=0;i<arr2.length;i++)
		{
			sum=sum+arr2[i];
		}		
		double avg=sum/arr2.length;
		System.out.println(avg);			

	}

}