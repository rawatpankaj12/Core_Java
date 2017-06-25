package method;

public class Area 
{
void rectangle()//without return type and without argument
{
	int a=10;
	int b=5;
	int area=a*b;
	System.out.println("area="+area);
	}
void square(int s)//without return type and with argument
{
	int area=(s*s);
	System.out.println("area="+area);
	}
int triangle()//with return type and without argumment
{
	int a=8;
	int b=17;
	int area=((a*b)/2);
	return area;
}
 float circle(int a)//with return type and with argument
{
	float area=((22*a*a)/7);
	return area;
	}


	
	public static void main(String[] args) 
	{
		Area a1=new Area();
		a1.rectangle();
		a1.square(5);
		int triangle=a1.triangle();
		System.out.println("area="+triangle);
		float circle=a1.circle(4);
		System.out.println("area="+circle);
		}
}


