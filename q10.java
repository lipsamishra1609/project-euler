//Find the sum of all the primes below two million.
public class q10 {
	/*public static boolean isPrime(long n)
	{
		boolean flag=true;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			return true; 
		}
		else
		{
			return false;
		}
	}*/
   public static void main(String[] args) {
		// TODO Auto-generated method stub
       long sum=2;
	   for(long n=3;n<2000000;n=n+2)
		{
		   int flag=0;
			for(int j=2;j<=Math.sqrt(n);j++)
			{
				if(n%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				sum=sum+n;
			}
		}

		System.out.println(sum);
	}
}
//output: 142913828922
