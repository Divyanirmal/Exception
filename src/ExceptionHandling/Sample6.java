package ExceptionHandling;

public class Sample6 
{
	public static void main(String[] args) 
	{
		int[] ar=new int[4]; //0-3
		try
		{
			ar[5]=10;//risky code
		}
		catch(ArithmeticException s)
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
		catch(Exception s1)
		{
			System.out.println("generic Exception handled");
			s1.printStackTrace();
		}
		System.out.println("Hi");
	}

}
