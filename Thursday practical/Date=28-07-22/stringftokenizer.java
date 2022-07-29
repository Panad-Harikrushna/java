import java.util.StringTokenizer;
class SimpleStringTokenizer{
	public static void main(String[] args )
		{
			StringTokenizer  st=new StringTokenizer("The five string methods are written below");
			while(st.hasMoreTokens())
			{
			System.out.println(st.nextToken());
			int a=st.countTokens();
			}
		String name=("Hello");
    System.out.println("Length function : "+name.length());
  	System.out.println("Character at function : "+name.charAt(2));
  	System.out.println("To lower case function : "+name.toLowerCase());
  	System.out.println("To upper case function : "+name.toUpperCase());
  	System.out.println("substring function : "+name.substring(0,4));
		}
}
