package Abstraction;


abstract class humans
{
	abstract void dancing();
	abstract void singing();
	
}

 abstract class men extends humans{
	
	void dancing()
	{
		System.out.println("dancing...");
	}
//	void singing()
//	{
//		
//	}
}
class women extends men
{
	void singing()
	{
		System.out.println("singing...");
	}
}



public class abstarctionexmp2 {

	public static void main(String[] args) {
		
		humans obj=new women();
		
		obj.dancing();
		obj.singing();
		
		
		
		
		
		
		

	}

}
