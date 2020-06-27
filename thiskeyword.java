package Keyword;

class A
{
	int a,b; //global variable -> access anywhere in class
	void get(int a, int b) {
		this.a=a;
		this.b=b;  //local variable ->only in this method
		
	}
	void display()
	{
		System.out.println(a +" "+b);
	}
	
}

public class thiskeyword {

	public static void main(String[] args) {
		A obj=new A();
		obj.get(10,20);
		obj.display();
		
		

	}

}
