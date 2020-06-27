package encapsulation;

class employee{
	
	private int empid;
	private String name;
	
	public int setEmpid(int x)
	{
		return empid=x;
		
	}
	public int getEmpid()
	{
		return empid;
	}
	public String setName(String newname)
	{
		 return this.name=newname;
	}
	public String getName()
	{
		return name;
	}
	
}

public class encapsulationexmpl1 {

	public static void main(String[] args) {
		
  employee obj=new employee();
  obj.setEmpid(12345);
  System.out.println(obj.getEmpid());
  
  obj.setName("sharath");
  System.out.println(obj.getName());
  
  
    
    
	}

}
