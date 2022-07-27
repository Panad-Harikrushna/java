import java.util.StringTokenizer;
class SimpleStringTokenizer{
	public static void main(String[] args )
		{
			StringTokenizer  st=new StringTokenizer("Hii guys welcome to my youtube channel");
			while(st.hasMoreTokens())
			{
			System.out.println(st.nextToken());
			int a=st.countTokens();
			}

		}


}