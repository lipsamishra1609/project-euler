//Find the sum of all the primes below two million.
public class prog10 {
	public static boolean isPrime(long n)
	{
		int flag=1;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
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
            long sum=2;
	    for(long n=3;n<2000000;n++)
		{
		   if(isPrime(n))
		   {
	    	   sum=sum+n;
	           }
		}
	    System.out.println(sum);
	}
}
//output: 142913828922
