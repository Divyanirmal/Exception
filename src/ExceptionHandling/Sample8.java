package ExceptionHandling;

public class Sample8
{
	public static void main(String[] args)
	{
		String s1="abcd";
		try
		{
			System.out.println(s1.charAt(5));
			/*try
			{
			System.out.println(s1.charAt(6));
		}*/
		}
			catch(StringIndexOutOfBoundsException e)
			{
			System.out.println("StringIndexOutOfBounds");	
			}
			catch(ArithmeticException e)
			{
				System.out.println("StringIn");
			}
		
		System.out.println("Hi");
		
	}
}