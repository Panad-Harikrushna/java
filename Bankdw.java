import java.util.*;
class Bank {

public static void main(String []args)
{
int ch,withdrawamt,totalamt=10000,dipositamt;
Scanner in=new Scanner(System.in);
System.out.println("Please enter your choice");
System.out.println("Press 1 for withdraw");
System.out.println("Press 2 for diposite");
ch=in.nextInt();
switch(ch){

case 1:
	System.out.println("Please enter your amount");
	withdrawamt=in.nextInt();
	totalamt=totalamt-withdrawamt;
	System.out.println("your current balence is "+totalamt);
	break ;

case 2:
	System.out.println("Please enter your amount");
	dipositamt=in.nextInt();
	totalamt=totalamt+dipositamt;
	System.out.println("your current balence is"+totalamt);
	break ;}

System.out.println("thanks for visiting");



}

}