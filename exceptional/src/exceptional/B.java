package exceptional;

public class B 
{

	public static void main(String[] args) 
	{
		System.out.println("Main1");
		try
		{
			int i=10/0;
		}
		catch(ArithmeticException ex)
		{
			//System.out.println(ex);
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("Main2");
	}

}
