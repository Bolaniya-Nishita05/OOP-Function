import java.util.Scanner;

public class Prime
{
	public static void main(String[] args)
	{
		System.out.print("ENTER NO.= ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=check(n);

		if(a==1)
		{
			System.out.println("PRIME");
		}
		else
		{
			System.out.println("NOT PRIME");
		}
	}

	static int check(int n)
	{
		int a=1;

		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				a=0;
				break;
			}
		}

		return a;
	}
}