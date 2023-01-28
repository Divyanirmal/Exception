package ExceptionHandling;

public class Sample3
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=2;
		int div=0;
		try
		{
			div=a/b;
			//10/2 //risky code
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		System.out.println(div);
		System.out.println("Hi");
		System.out.println("GM");
	}

}
