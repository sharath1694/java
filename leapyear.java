package Package1;
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int a=sc.nextInt();
		if(a%400==0)
		{
			System.out.println("Leap year");
		}
		else if (a%100==0)
		{
			System.out.println("Leap yearrr");
			
		}
		else if(a%4==0)
		{
			System.out.println("leap year");
			
		}
		else 
		{
			System.out.println("Not leap year");
		}

	}

}
