/*1.Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.*/

//Ans-->>

import java.util.*;

class ReverseInteger
{
public static void main(String[] args)
{
int n,j,k,rev=0;
Scanner in=new Scanner(System.in);
System.out.println(" Enter a integer   :");
n=in.nextInt();
System.out.println(" Entered number is :"+n);
while(n>0)
{
j=n/10;
k=n%10;
rev=rev*10+k;
n=j;
}
System.out.println(" After reverseing the number. number is :"+rev);
}
}



