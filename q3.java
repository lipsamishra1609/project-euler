//What is the largest prime factor of the number 600851475143 
public class prog3 {

	public static boolean IsPrime(long n)
	{
		int flag=1;
		for(long i=2;i*i<=n;i++)
	    {
	  	  if (n%i==0)
	  	  {
	  		 flag=0;
	  		 break;
	  	  }
	  	 
		  }
	    if (flag==1)
	  		  {
	  	  return true;
	  	  }
	    else
	    {
	  	  return false;
	    }
	 }
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	        long n=600851475143L;
	        long max=0;
	        for (long i=2;i*i<=n;i++)
	        {
	        	if(n%i==0)
	        	{
	        		if(IsPrime(i))
	        		{
	        	       if(i>max)
	        	      {
	        	    	max=i;
	        	      }
	                }
	             }
	         }
	        System.out.println("maximum prime factor : "+max);
	     }
}

// output : 6857
