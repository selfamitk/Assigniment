package Recursion;

public class pallindrom {
	
	public static boolean ispallindrom(int l,int r,String str)
	{  
		if(l>=r)
	    {
		  return(true);
	    }
	
		if(str.charAt(l)!=str.charAt(r))
		{
			return(false);
		}
		
		else
		{
			return(ispallindrom(l+1,r-1,str));
		}
			
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 String str = "qwertyuytrewq";
		 if(ispallindrom(0,str.length()-1,str))
		 {
			 System.out.println(" this is pallindrom");
		 }
		 else
		 {
			 System.out.println("not pallindrom");
		 }

	}

}
