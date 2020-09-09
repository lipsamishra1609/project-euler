import java.util.*;
public class prog7 {
	
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
	
	 int count=0;	
	 long primeNumber=0;
     long i=2;
     
     while(count<10001)
     {
    	 if(isPrime(i))
    	 {
    		primeNumber=i;
    		count++;
    	 }
    	 i++;
     }
      System.out.println("10001st prime number is : "+primeNumber);
	}

}