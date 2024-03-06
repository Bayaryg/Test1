package javaassignments;

public class Assignment49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr1[]= {2,3,4,3};
      
      assert arr1.length==4 :"The length is equal to 4";
      
      int sum=0;
      
      for(int i=0;i<arr1.length;i++)
      {
    	 sum=sum+arr1[i]; 
      }
      System.out.println(sum);
	}

}
