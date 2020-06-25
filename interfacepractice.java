package polymorphism;


interface abc
{
	public void show();
}

class pqr implements abc
{
	
	public void show()
	{
		System.out.println("Show the value ");
	}
	public void display()
	{
		System.out.println("Display the value ");
	}
}

public class interfacepractice {

	public static void main(String[] args) {
		abc obj12=new pqr();
		obj12.show();
		
		
		
	

	}

}
