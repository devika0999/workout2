import java.util.*;
public class MathOperations
{

public static double add(double x,double y)
{
	double r= x+y;
	return r;
}
public static double Multiply(double x, double y)
{
	double r= x*y;
	return r;

}
public static double power(double x, double y)
{
	double r= Math.pow(x,y);
	return r;
}
public void display(double r1,double r2, double r3)
{
	
	System.out.println("Sum of two numbers: "+r1);
	
	System.out.println("product of two numbers: "+r2);
	System.out.println("power of numbers: "+r3);
}
public static void main(String args[])
{
double x,y,r1,r2,r3;

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the values of x and y");
 x=sc.nextInt();
 y=sc.nextInt();
  MathOperations obj = new  MathOperations();
 r1=obj.add(x,y); 
 r2=obj.Multiply(x,y);
 r3=obj.power(x,y);
 obj.display(r1,r2,r3);
}

}


