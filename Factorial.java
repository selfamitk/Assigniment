package Recursion;
import java.util.Scanner;
public class Factorial{

	public  int fac(int n)
	{
		if(n<0)
		{
			System.out.println("factorial of negative number is not possible");
			return(0);
		}
		
		if(n==0)
		{
			return(1);
		}
		else
		{
			return(n*fac(n-1));
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Factorial obj=new Factorial();
		int a=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter nuber to find factorial");
		a=sc.nextInt();
		System.out.printf("factorial of %d is %d",a,obj.fac(a));
	}

}
