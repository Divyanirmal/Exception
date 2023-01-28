package ExceptionHandling;

public class Sample4
{
	public static void main(String[] args)
	{
		int[] ar=new int[4];
		try
		{
			ar[4]=10;
			//risky code
		}
		catch(ArithmeticException s1)
		{
			System.out.println("ArithmeticException");
		}
		catch(StringIndexOutOfBoundsException s2)
		{
		System.out.println("StringIndexOutOfBoundsException");	
		}
		catch(ArrayIndexOutOfBoundsException s3)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		System.out.println("Hello");
	}

}
