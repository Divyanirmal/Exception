package ExceptionHandling;

public class Sample5
{
	public static void main(String[] args) 
	{
		int[] ar=new int[4];//0-3
		try
		{
			ar[5]=10;//risky code
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception handled");
			e.printStackTrace();
		}
		System.out.println("Hello");
		
	}

}
