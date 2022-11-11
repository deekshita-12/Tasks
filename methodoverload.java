package overload;

import java.util.Scanner;

class OverloadDemo
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
}
class Overload 
{
     public static void main(String args[]) 
	{
	   OverloadDemo ob = new OverloadDemo();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the length of side of the square");
	   float s;
	   s=sc.nextFloat();
	   ob.area(s);
	   System.out.println("Enter the length and breadth of the rectangle :");
	   float l,b;
	   l=sc.nextFloat();
	   b=sc.nextFloat();
	   ob.area(l,b);
     }
}
