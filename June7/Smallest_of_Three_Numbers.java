package June7;

public class Smallest_of_Three_Numbers {

	public static void main(String[] args) 
	{
		int a=100, b=200, c=30;
		
		if(a<b && a<c)
		{
			System.out.println("a is smallest:"+a);
		}
		
		else if(b<c && b<a) 
		{
			System.out.println("b is smallest:"+b);
		}
		else 
		{
			System.out.println("c is smallest:"+c);
		}

	}

}
