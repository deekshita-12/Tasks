package area;
import java.util.*;
interface calc
{
	double area(double x, double y);
	double perimeter(double x, double y);
}
class calculate implements calc 
{
	public double area(double x, double y)
	{
		return(x*y);
	}
	public double perimeter(double x, double y)
	{
		return(2*(x+y));
	}
}
public class rectangle
{
	public static void main(String args[])
	{
		calculate c = new calculate();
		Scanner sc = new Scanner(System.in);
		double a,p,l,b;
		System.out.println("Enter the length and breadth of the rectangle");
		l=sc.nextDouble();
		b=sc.nextDouble();
		a=c.area(l, b);
		p=c.perimeter(l, b);
		System.out.println("Area :"+a+" Perimeter :"+p);
	}
}
