package encapsulation;
class encap
{
	private int a;
	void getvalue()
	{
		System.out.println(a);
	}
	void setvalue(int x)
	{
		a=x;
	}
}
public class encapsulationexample {

	public static void main(String[] args) {
		

encap obj=new encap();
obj.setvalue(10);
obj.getvalue();
}

}
