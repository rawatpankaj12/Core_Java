package method;

public class Calculator {
	void add()//without return type and without argument
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	void sub(int a,int b)//without return type and with argument
	{
		int sub=a-b;
		System.out.println("sub="+sub);
	}
int mul()//with return type and without argument
{
int a=10;
int b=20;
int mul=a*b;
return mul;
}	
int div (int a,int b)//with return type and with argument
{
	int div=a/b; 
	return div;
	}
	public static void main(String[] args)
	{
	Calculator C1=new Calculator();
	C1.add();
	C1.sub(20,10);
	int mul=C1.mul();
	System.out.println("mul="+mul);
	int div=C1.div(20,5);
	System.out.println("div="+div);
	}

}
