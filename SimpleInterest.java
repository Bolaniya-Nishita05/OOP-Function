import java.util.Scanner;

public class SimpleInterest
{
	public static void main(String[] args)
	{
		System.out.println("ENTER PRINCIPLE,RATE AND TIME= ");
		Scanner sc=new Scanner(System.in);
		float p=sc.nextFloat();
		float r=sc.nextFloat();
		float t=sc.nextFloat();

		simpleInterest(p,r,t); 
	}

	static void simpleInterest(float p,float r,float t)
	{
		double interest;
		interest=(p*r*t)/100;

		System.out.println("SIMPLE INTEREST= "+interest);
	}
}