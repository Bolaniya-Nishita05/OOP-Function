import java.util.Scanner;

public class max2
{
	public static void main(String[] args)
	{
		System.out.println("ENTER NO1 AD NO2= ");
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		int no2=sc.nextInt();

		max(no1,no2);
	}

	static void max(int no1,int no2)
	{
		if(no1==no2)
		{
			System.out.println("BOTH ARE EQUAL");
		}
		else
		{
			int max=(no1>no2)?no1:no2;

			System.out.println("MAXIMUN= "+max);
		}
	}
}