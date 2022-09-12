import java.util.*;
public class Swapvalue 
{
    int a,b;
    Swapvalue()
    {

    }
    Swapvalue(int p, int q)
    {
        a=p;
        b=q;
    }
    void Swap(int a,int b)
    {
	System.out.println("*****CALL BY VALUE*****");
	System.out.println("Before Swapping a = " +a+ " and b = " +b);
        int c =a;
        a=b;
        b=c;
	System.out.println("After Swapping a = " +a+ " and b = " +b);
	
    }
    void Swapref(Swapvalue val)
    {
	System.out.println("*****CALL BY REFERENCE*****");
        System.out.println("Before Swapping:  a =" +a+ " and b = " +b);
		int c;
		c=val.a;
		val.a=val.b;
		val.b=c;
		System.out.println("After Swapping: a =" +val.a+ " and b = " +val.b);
    }


    public static void main(String[] args)
    {	

        Scanner sc = new Scanner(System.in);
		Swapvalue s1 = new Swapvalue();
		System.out.println("Enter the numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		s1.Swap(a,b);
		

		Swapvalue s2 = new Swapvalue(a,b);
		s2.Swapref(s2);
    }
}
