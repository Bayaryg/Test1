package javaassignments;
interface School
{
	void student1();
}
interface ClassRoom 
{
	void student2();
	}

public class Assignment19 implements ClassRoom,School{ //multiple level inheritence
	
	void student3()
	{
		System.out.println("this is concrete");
	}

	public static void main(String[] args) {

		Assignment19 a1=new Assignment19();
		a1.student2();
		a1.student3();
		a1.student1();
	}
	
	public void student2() {
		
		System.out.println("this is abstract1");
	}

	
	public void student1() {
		
		System.out.println("this is abstract2");
	}

}
