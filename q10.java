//Find the sum of all the primes below two million.
import java.util.*;
public class q10 {
	public static boolean isPrime(long n)
	{
		boolean flag=true;
		for(int i=3;i<=Math.sqrt(n);i=i+2)
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
	}
   public static void main(String[] args) {
		// TODO Auto-generated method stub
       long sum=2;
	   for(long n=3;n<2000000;n=n+2)
		{
		   if(isPrime(n))
		   {
			   sum+=n;
		   }
		}
	   
		System.out.println(sum);
	}
}
//output: 142913828922
