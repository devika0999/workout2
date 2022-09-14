

import java.util.*;
public class Emp
{
	static double empno, salary , totalsalary;

Emp()
{
}

Emp(double salary)
{
empno++;
System.out.println("employee number ="+empno);
this.salary=salary;
totalsalary= salary+totalsalary;
}

static void display()
{
	System.out.println("total employee="+empno);
	System.out.println("total salary"+totalsalary);
}
public static void main(String args[])
{	
	double s1,s2,s3;
	Scanner sc = new Scanner(System.in);
	System.out.println("salary of first employee");
	s1=sc.nextDouble();
	Emp e1 = new Emp(s1);

	System.out.println("salary of sec employee");
	s2=sc.nextDouble();
	Emp e2 = new Emp(s2);

	System.out.println("salary of third employee");
	s3=sc.nextDouble();
	Emp e3 = new Emp(s3);
	Emp.display();

}

}


