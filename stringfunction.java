class Stringlength
{
  public static void main(String[]  args)
  {
      String name=("Hello");
    	System.out.println("Length function : "+name.length());
	System.out.println("Character at function : "+name.charAt(2));
	System.out.println("To lower case function : "+name.toLowerCase());
	System.out.println("To upper case function : "+name.toUpperCase());
	System.out.println("ndex function : "+name.indexOf("l"));
	System.out.println("substring function : "+name.substring(0,4));
	System.out.println("Replace function : "+name.replace('H','C'));
      String name1="       Anudip";
	System.out.println("Trim function : "+name1.trim());
	System.out.println("Equal function : "+name.equals("hello"));
	System.out.println("Equal and ignor case function : "+name.equalsIgnoreCase("hello"));
	System.out.println("Starts with function : "+name.startsWith("ja"));
	
 }
}
