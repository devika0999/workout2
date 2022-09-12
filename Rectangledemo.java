import java.util.*;
public class Rectangledemo
{
	double l , b ;
	
	Rectangledemo(double x)
	{
		l=b=x;
	}
	Rectangledemo(double x, double y)
	{
		l=x;
		b=y;
	}
	double getArea()
	{
		return l*b;

	}
	double getPerimeter()
	{
		return 2*(l+b);
	}

	public static void main(String args[])
	{	
		double a1,a2,p1,p2;
		Rectangledemo obj1 = new Rectangledemo(5.0);
		Rectangledemo obj2 = new Rectangledemo(6.0,7.0);
		a1 = obj1.getArea();
		System.out.println("Area when constructor overloaded with one parameter"+a1);
		a2 = obj2.getArea();
		System.out.println("Area when constructor overloaded with two parameter"+a2);
		p1 = obj1.getPerimeter();
		System.out.println("Perimeter when constructor overloaded with one parameter"+p1);
		p2 = obj2.getPerimeter();
		System.out.println("Perimeter when constructor overloaded with two parameter"+p2);
		
		
	}
}