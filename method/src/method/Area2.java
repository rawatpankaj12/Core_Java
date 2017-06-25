package method;

public class Area2 
{
	void square(int s)//without return type and with argument
	{
		int area=s*s;
		System.out.println("Area of square="+area);
	}
	void rectangle(int a,int b)//without return type and with argument 
	{
		int area=a*b;
		System.out.println("Area of rectangle="+area);
	}
	void triangle(int l,int h)//without return type and with argument
	{
		int area=((l*h)/2);
		System.out.println("Area of triangle="+area);
	}
	void circle(int r)//without return type and with argument
	{
		int area=((22*r*r)/7);
		System.out.println("Area of circle="+area);
	}

	public static void main(String[] args)
	{
		Area2 a1=new Area2();
		a1.square(7);
		a1.rectangle(6,9);
		a1.triangle(4,6);
		a1.circle(8);
		

	}

}
