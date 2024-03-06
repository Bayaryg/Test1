package javaassignments;

public class Assignment35 {

	public static void main(String[] args) {
		int num[]=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		int checknum=44;
		
			
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]==checknum)
		
			{
			System.out.println("The number is present in the array!");
			break;
			}
			if(num.length==i+1)//5==4+1
			{
			System.out.println("The number is not present in array !");
			}
		}
					
	}

}
