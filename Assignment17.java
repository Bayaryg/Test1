package javaassignments;
abstract class Test18  //abstract class
{
	abstract void weight(); //abstract method
	
}
class Test17 extends Test18 //concrete class
{
	void height() //concrete method
	{
		int h=6;
		System.out.println("the height is "+h);
	}
	void weight()//abstract class implementation
	{
		int w=60;
		System.out.println("the height is "+w);
	}
}
public class Assignment17 extends Test17{	//concrete child class
	void height()
	{
		int h=6;
		int g=30;
		System.out.println(g+h);
	}
	void weight()
	{
		int w=60;
		int x=12;
		
		System.out.println(w+x);
	}
	public static void main(String[] args) {
		Assignment17 a1=new Assignment17();
		a1.height();
		a1.weight();
	}

}
