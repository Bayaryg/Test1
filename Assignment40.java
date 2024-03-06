package javaassignments;

public class Assignment40 {
	
	

	public static void main(String[] args) {
		
		int arr1[]= {23,1,56,2,-12,-78};
		int max=arr1[0];//assume
		int min=arr1[0];//assume
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>max)
			{
				max=arr1[i];	
				
			}				
			
			if(arr1[i]<min)
			{
				min=arr1[i];				
			}			
		}
		System.out.println("Maximum number is "+max);
		System.out.println("Minimum number is "+min);			

	}

}
