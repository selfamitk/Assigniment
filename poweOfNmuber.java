package Recursion;
import java.util.*;
public class poweOfNmuber{
	//define a static method to calculate nth power of a number
	public static int power(int a,int n)
	{ 
		 if(a==0 && n==0)
		    {
		    	System.out.println("Zero to power zero not define");
		    	return(-1);
		    }
	    if(a==0)
	    {
	    	return(0);
	    }
	   
	    if(n==0)
	    {
	    	return(1);
	    }
	    if(n==1)
	    {
	    	return(a);
	    }
	    //condition for negative  power
	   if(n<0) 
	    {
	    	int p, q;
	    	q=-(n);
	    	p=a*power(a,q-1);
	    	return(a/p);
	    }
	    else
	    {
	    	return(a*power(a,n-1));
	    }
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int res=0;
		Scanner sc = new Scanner(System.in);
		int a=0,b=1;
		System.out.println("enter base number");
		a=sc.nextInt();
		System.out.println("enter power number");
		b=sc.nextInt();
		if(b%2==0)
		{
			res=power(a,b/2)*power(a,b/2);
		}
		else
		    res=a*power(a,b/2)*power(a,b/2);
		System.out.printf(" %d th power of %d is %d",b,a,res);
		/*if(res>-1)
		{
			System.out.println(res);
		}*/
		/*else
		{
			System.out.println("enter valid number");
		}*/

	}

}