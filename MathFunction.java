import java.util.*;
public class MathFunction
{

	public static int Multiply(int x , int y)
	{

		return x*y;

	}public static double Multiply(double x , double y)
	{

		return x*y;

	}
	public static double Multiply(int x , double y)
	{

		return x*y;

	}
	
	public static void main(String args[])
	{
	double x,y;
	MathFunction math = new MathFunction();
	System.out.println(math.Multiply(3,4));
	System.out.println(math.Multiply(3.5,4.5));
	System.out.println(math.Multiply(3,4.2));
		}
	

}