
import java.util.*;
public class Count
{  
private static int count;  
public Count()   
{  
count++;  
}  
public static void main(String args[])   
{  
Count ob1 = new Count();  
Count ob2 = new Count();  
Count ob3 = new Count();  
Count ob4 = new Count();  
Count ob5 = new Count();  
Count ob6 = new Count();  
Count ob7 = new Count();  
Count ob8 = new Count();  

System.out.print("Total Number of Objects: " + Count.count);  
}  
}  