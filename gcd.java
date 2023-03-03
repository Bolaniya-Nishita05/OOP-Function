import java.util.Scanner;

public class gcd
{
	public static void main(String[] args)
	{
		System.out.println("ENTER NO1 AND NO2= ");
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		int no2=sc.nextInt();

		int ans=gCD(no1,no2);

		System.out.println("GREATEST COMMON DIVISOR= "+ans);
	}

	public static int gCD(int no1,int no2)
	{
		int min=(no1<no2)?no1:no2;
		int ans=0;

		for(int i=1;i<=min;i++)
		{
			if(no1%i==0 && no2%i==0)
			{
				ans=i;
			}
		}

		return ans;
	}
}