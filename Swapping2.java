import java.util.*;

class SwapingTwo{
public static void main(String []args)
{
int x,y;
Scanner in=new Scanner(System.in);
System.out.println("Enter the value of x");
x=in.nextInt();
System.out.println("Enter the value of y");
y=in.nextInt();
System.out.println("\nBefore swapping the value of x="+x+"  and y="+y);
y=x+y;
x=y-x;
y=y-x;
System.out.println("\nAfter swapping the value of x="+x+" and y="+y);
}}