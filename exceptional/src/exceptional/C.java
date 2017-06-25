package exceptional;

public class C 
{

	public static void main(String[] args)
	{
		System.out.println("Main1");
		try
		{
			System.out.println("try");
			int i=10/0;
		}
		//int i=90;//unreachable stmt
		catch(ArithmeticException ex)
		{
			int i=20;
			System.out.println("catch");
		}
System.out.println("Main2");
	}

}
