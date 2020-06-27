package Keyword;

public class finalkeyword {
	
	int empid;
	String name;
	
	final String company="WIPRO";
	
	finalkeyword(int id, String empname)
	{
		empid=id;
		name=empname;
		
	}
	
	void display()
	{
		System.out.println(empid +" " +name+" " +company);
	}
	
	
	

	public static void main(String[] args) {
		
finalkeyword obj=new finalkeyword(1111, "sharath");
obj.display();
	}

}
