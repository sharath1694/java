package Abstraction;
abstract class Abstract
{
	abstract void run();
	
	void print()
	{
		System.out.println("hello");
	}
}
class Im extends Abstract
{
	void run()
	{
		System.out.println("Good Morning");
	}
}


public class abstractionexample {

	public static void main(String[] args) {
		Im obj=new Im();
		obj.run();
		obj.print();

	}

}
