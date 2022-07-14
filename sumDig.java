/*2.Sum of Digits Program in Java*/


import java.util.*;

class SumDigit
{
         public static void main(String[] args)
	{
	int n,j,k,sum=0;
	Scanner in=new Scanner(System.in);
	System.out.println(" Enter a integer   :");
	n=in.nextInt();
	System.out.println(" Entered number is :"+n);

	while(n>0)
	{
		j=n/10;
		k=n%10;
		sum=sum+k;
		n=j;
	}
		System.out.println(" The sum of digits is :"+sum);
     }
}



