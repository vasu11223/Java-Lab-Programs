import java.util.Scanner; class Prog1
{
	public static void main(String args[ ])
	{
		Scanner sc=new Scanner(System.in); Fibonacci obj=new Fibonacci ();
		int a,b,c;
		System.out.println("Which term you want to print "); 
		a=sc.nextInt();
		b=obj.fibo_recursion(a);
		System.out.println("The "+a+"th Fibonacci term using recursion is: "+b); 
c=obj.fibo_non_recursion(a);
		System.out.println("The "+a+"th Fibonacci term using non recursion is: "+c);
	}
}

class Fibonacci
{
	int a=1,b=1,c;
	public int fibo_recursion (int n)
	{
		if(n == 1)
			return a; 
		else if(n == 2)
			return b; 
		else
			return fibo_recursion(n-1) + fibo_recursion(n-2);
	}
	public int fibo_non_recursion (int n)
	{
		if(n==1) 
			return a;
		else if(n==2) 
			return b;
		else
		{
			for(int i=3 ; i<=n ; i++)
			{
				c=a+b; 
				a=b; 
				b=c;
			}
			return c;
		}
	}
}
