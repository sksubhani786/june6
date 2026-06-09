package June7;

public class Largest_of_Two_Numbers {

	public static void main(String[] args)
	{
		int a=20,  b=30;
		/*if(a>b) 
		{
			System.out.println("a is largest:"+a);
		}
		else 
		{
			System.out.println("b is largest:"+b);
		}*/
		
		//using ternary operator
		
		int x= (a>b)?a:b;
		
		System.out.println("the largest number is:"+x);
	}

}
