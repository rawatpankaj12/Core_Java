package method;

public class Area3
{
int square()//with return type and without argument
{
	int s=7;
	int area=s*s;
	return area;
	}
int rectangle()//with return type and without argument
{
int a=5;
int b=7;
int area=a*b;
return area;
}
int triangle()
{
	int l=4;
	int h=6;
	int area=((l*h)/2);
	return area;
	}
float circle()
{
	int r=6;
	int area=((22*r*r)/7);
	return area;
	}
	public static void main(String[] args)
	{
		Area3 a1=new Area3();
		int square=a1.square();
		System.out.println("Area of square="+square);
		int rectangle=a1.rectangle();
		System.out.println("Area of rectangle="+rectangle);
		int triangle=a1.triangle();
		System.out.println("Area of triangle="+triangle);
		float circle=a1.circle();
		System.out.println("Area of circle="+circle);

	}

}
