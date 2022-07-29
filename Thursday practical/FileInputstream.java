/*program to write a text about your favorite place/food/person and read text from a file from a specified index or skipping byte using FileInputStream  */

import java.io.*;
class FlieInputStreamDemo
{
 public static void main(String[] args)
   { 
      try
         {
           FileInputStream sa = new FileInputStream("c:/new/new.txt");
  	   int a;
	        while((a=sa.read())!=-1)
	            {
	              System.out.print((char)a);
	             }
   sa.close();
        }catch(Exception ex){System.out.println(ex);  }
   }
}
