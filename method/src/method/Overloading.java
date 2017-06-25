package method;

public class Overloading
{
void test()
{
System.out.println("test");	
}
void test(int i)
{
	System.out.println("test with arguments");
	}
public static void main(String[] args)
{
	Overloading o1=new Overloading();
	o1.test();
	o1.test(5);
	}
}
