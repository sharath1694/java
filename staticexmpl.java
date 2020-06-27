package Keyword;

public class staticexmpl {
	
	int rollno;
	String name;
	
	static String college="SNIST";
	
	 staticexmpl(int x, String name)
	{
		rollno=x;
		this.name=name;	
	}
	void display()
	{
		System.out.println("rollno:"+rollno +" " +"Name:"+name+" " +"college is:"+college );
	}
	
	public static void main(String[] args) {
		
		 college="JNTU";
		
		staticexmpl obj=new staticexmpl(12345, "sharath");
		
	obj.display();

	}

}
