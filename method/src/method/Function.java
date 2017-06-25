package method;

public class Function {
	static void test()
	{
		System.out.println("test");
	}
	void test1()
	{
		System.out.println("test1");
	}
public static void main(String[] args)
{

	System.out.println("Main");
	Function f1=new Function();
	test();
	f1.test1();
	}
}
