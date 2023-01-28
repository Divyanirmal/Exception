package ExceptionHandling;

public class Sample7
{
	public static void main(String[] args)
	{
		int[] ar=new int[3];
		try
		{
			ar[5]=10;
			//risky code1
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		try
		{
			//risky code2
			ar[6]=2;
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
		System.out.println("ArrayIndexOutOfBoundsException handeled");	
		}
		System.out.println("Hello");
	}
}