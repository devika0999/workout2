import java.util.*;
public class Employe
{
String emp_name,result;
	int emp_id;
	float ass1 ,ass2, ass3, per ,total;

Employe()
{

	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter employee name and id");
	emp_name= sc.nextLine();
	emp_id=sc.nextInt();
	
	System.out.println("Enter the assessment marks");
	ass1=sc.nextFloat();
	ass2=sc.nextFloat();
	ass3=sc.nextFloat();
	System.out.println("Employee Name ="+emp_name+" "+"Employee ID ="+emp_id);
}

void total()
{     
	float result= ass1+ass2+ass3;
	System.out.println("Employee total marks="+result+"/300");
}
void percentage ()
{     
	float total =ass1+ass2+ass3;
	float per= (total/300)*100;
	System.out.println("Employee Percentage="+per);
}



void condition ()
{	
	
	
	if(ass1>=75 && ass2>=75 && ass3>=75)
	{
		 System.out.println("promoted");
		
	}
	else
	{
	 	System.out.println("demoted");
		
	}
}


public static void main(String args[])
{
	Employe emp =new Employe();

	emp.total();
	emp.percentage();
	emp.condition();

	
	
	
}	
}
