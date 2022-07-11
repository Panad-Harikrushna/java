
/*3.When i is casted to c the value corresponding to the ascii code of 81 which is 'Q' is assigned.
When d is casted to i the decimal part .142 is truncated and only 323 is assigned to i.
Similarly when f is casted to i, the decimal part .38 is truncated and only 72 is assigned to i.
When d is casted to b whose range is -128 to 127, not only the decimal part .142 is truncated but it is also shortened from 323 to 67 so as to fit in byte range.                                                                                                                                                                                                                                  "
i = 81 c = Q
d = 323.142 i = 323
f = 72.38 i = 72
d = 323.142 b = 67
*/

// Ans==>



class DatatypeCasting
{
    public static void main(String arg[])
    {
        byte b;
        int i = 81;
        double d = 323.142;
        float f = 72.38f;
        char c = 'A';
        
        c = (char) i;
        System.out.println("i = " + i + " c = " + c);
        
        i = (int) d; 
        System.out.println("d = " + d + " i = " + i);
        
        i = (int) f;
        System.out.println("f = " + f + " i = " + i); 
        
        b = (byte) d;
        System.out.println("d = " + d + " b = " + b);
    
    }
}
