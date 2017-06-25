package method;

public class Area1 
{
void square()//without return type and without argument
{
	int s=7;
	int area=s*s;
	System.out.println("Area of square="+area);
	
	}
void rectangle()//without return type and without argument
{
int a=5;
int b=7;
int area=a*b;
System.out.println("Area of rectangle="+area);
}
void triangle()//without return type and without argument
{
int h=10;
int b=8;
int area=((h*b)/2);
System.out.println("Area of triangle="+area);
	}
void circle()//without return type and without argument
{
int r=9;
float area=((22*r*r)/7);
System.out.println("Arae of circle="+area);
}
public static void main(String[] args)
{
Area1 a1=new Area1();
a1.square();
a1.rectangle();
a1.triangle();
a1.circle();
}
}
