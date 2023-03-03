import java.util.Scanner;

public class AreaCST
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER 1 FOR CIRCLE");
		System.out.println("ENTER 2 FOR SQUARE");
		System.out.println("ENTER 3 FOR TRIANGLE");
		int choice=sc.nextInt();

		switch(choice)
		{
			case 1: area();
					break;

			case 2: System.out.println("ENTER SIDE OF SQUARE= ");
					int side=sc.nextInt();

					area(side);
					break;

			case 3: System.out.println("ENTER ALL SIDES OF TRIANGLE= ");
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();

					double areaTriangle=area(a,b,c);

					System.out.println("AREA OF TRIANGLE= "+areaTriangle);
					break;

			default: System.out.println("INVALID ENTRY");
		}
	}

	public static void area()
	{
		int r;
		System.out.println("ENTER RADIUS OF CIRCLE= ");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();

		double area=3.14*r*r;

		System.out.println("AREA OF CIRCLE= "+area);
	}

	public static void area(int side)
	{
		int area=side*side;

		System.out.println("AREA OF SQUARE= "+area);
	}

	public static double area(int a,int b,int c)
	{
		double s=(a+b+c)/2;

		return Math.sqrt(s*(s-a)+s*(s-b)+s*(s-c));
	}
}