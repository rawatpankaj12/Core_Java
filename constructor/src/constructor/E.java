package constructor;

public class E 
{
E()
{
this(12);
System.out.println("a-const");
}
E(int i)
{
	System.out.println("a-const2");
	}
	public static void main(String[] args)
	{
	E a1=new E();

	}

}
