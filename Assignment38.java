package javaassignments;

public class Assignment38 {

	public static void main(String[] args) {
		int arr1[]= {4,1,0,7,2};
	//	Arrays.sort(arr1);
		
	//	System.out.println("Max Value is "+arr1[arr1.length-1]);
	//	System.out.println("Min Value is "+arr1[0]);
		
		
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
		System.out.println("Maximum number is"+max);
		System.out.println("Minimum number is"+min);

	}

}
