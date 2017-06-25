package constructor;

public class A 
{
A()
{
	System.out.println("const");
	}
A(int i)
{
	System.out.println("const with arg");
	}
public static void main(String[] args)
{
A a1=new A();
A a2=new A(12);
System.out.println("main");
}
}
s
