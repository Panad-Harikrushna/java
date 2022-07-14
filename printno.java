/*4.Prints the numbers from 1 to 100 such that:

If the number is a multiple of 3, you need to print "Deep" instead of that number.
If the number is a multiple of 5, you need to print "Tech" instead of that number.
If the number is a multiple of both 3 and 5, you need to print "DeepTech" instead of that number.*/



import java.util.*;

class PosNeg
{
public static void main(String[] args)
{
int i;
	System.out.println("printing no. 1 to 100");
	for(i=1;i<=100;i++)
	{

	if(i%15==0)
		{
		System.out.print("DeepTech,");	
		}
	else if (i%5==0) 
		{
		System.out.print("Tech,");
		}
	else if(i%3==0)	
		{
		System.out.print("Deep,");
		}
	else
		{
		System.out.print(i+",");
		}
        }
    }
}



