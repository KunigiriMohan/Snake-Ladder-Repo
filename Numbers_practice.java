
import java.util.Scanner;
 
 
 class Numbers_practice
{
	public static void main(String[] args)
	{
		Mohan_practice p = new Mohan_practice();
		p.palindrome();
		p.fibonacci();
		p.factorial();
	}
	
	void palindrome() 
		
		{
			int n, b, rev = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Palindrome from : ");
			int N = sc.nextInt();
			System.out.println("Enter the Palindrome to : ");
			int K = sc.nextInt();
			System.out.println("Palindrome numbers from "+N+" to "+K+" : ");
			for (int i = N; i <= K; i++)
			{
				n = i;
				while (n > 0)
				{
					b = n % 10;
					rev = rev * 10 + b;
					n = n / 10;
				}
					if (rev == i)
					{
						System.out.println(i + " ");
					}
				rev = 0;
			}
		}

	
	void factorial()
	{
		long i;
		long fact=1;  
		
		System.out.println("Enter Number to  Find Factorial of a number : ");
		Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
				for(i=2;i<=num;i++)
					{    
						fact=fact*i;    
					}    
		System.out.println("Factorial of "+num+" is: "+fact);    
	}
	

	void fibonacci()
	{
		int n1=0,n2=1,n3=0,i;    
			System.out.println("Enter a number upto which we need find Fibonaccii series");
			Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
			System.out.println(n1);
			System.out.println(n2);
	
		while( n3 <= count)   
			{    
				System.out.println(n3);
				n3=n1+n2;    
				/*if (n3 <= count)
				{*/
					/*System.out.println(n3);*/    
					n1=n2;    
					n2=n3;    
				/*}*/
				    
			}    
		}	
}