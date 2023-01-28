package ExceptionHandling;

public class Sample2
{
	public static void main(String[] args) 
	{
		String s1="abcd";//0to3
		try
		{
			System.out.println(s1.charAt(4));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		System.out.println("GM");
		
	}

}
