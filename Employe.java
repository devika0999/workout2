import java.util.*;
public class Employe
{

public static float total(float ass1,float ass2,float ass3)
{     
	float total= ass1+ass2+ass3;
	return total;
}
public static float percentage (float ass1,float ass2,float ass3)
{     
	float total =ass1+ass2+ass3;
	float per= (total/300)*100;
	return per;
}

public static void main(String args[])
{
	String emp_name,result;
	int emp_id;
	float ass1 ,ass2, ass3, per ,total;
	
	Employe emp =new Employe();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter employee name and id");
	emp_name= sc.nextLine();
	emp_id=sc.nextInt();
	
	System.out.println("Enter the assessment marks");
	ass1=sc.nextFloat();
	ass2=sc.nextFloat();
	ass3=sc.nextFloat();

	System.out.println("Employee Name ="+emp_name+" "+"Employee ID ="+emp_id);
	System.out.println("Employee total marks="+emp.total(ass1,ass1,ass3)+"/300");
	System.out.println("Employee Percentage="+emp.percentage(ass1,ass1,ass3));
	if(ass1>=75 && ass2>=75 && ass3>=75)
	{
		System.out.println("promoted");

	}
	else
	{
		System.out.println("demoted");

	}


}	
}
