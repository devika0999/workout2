import java.util.*;
class Employee
    {
    static double empNo;
    static double salary;
    static double totalSalary;
    
    Employee()
    {
    }
    Employee(double salary)
    {
        empNo++;
        System.out.println("Employee Number="+empNo);
        this.salary=salary;
        System.out.println("Salary="+salary);
        totalSalary=salary+totalSalary;
    }
    static void display()
    {
        System.out.println("Total number of employee"+" "+empNo);
        System.out.println("Total Salary of the employees"+" "+totalSalary);
    }

    public static void main(String args[]){
        float s1,s2,s3;
       
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the salary of first employee:");
        s1=s.nextFloat();
        Employee e=new Employee(s1);

        System.out.println("Enter the salary of second employee:");
        s2=s.nextFloat();
        Employee e1=new Employee(s2);

        System.out.println("Enter the salary of third employee:");
        s3=s.nextFloat();
        
        Employee e2 =new Employee(s3);
        Employee.display();
    }
}
