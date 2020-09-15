//What is the 10001st prime number?
public class q7 {
    public static boolean isPrime(long n)
	{
		if(n<2)
		{
			return false;
		}
		if(n%2==0)
		{
			return false;
		}
		for(int i=3;i<=Math.sqrt(n);i=i+2)
		{
			if(n%i==0)
			{
		      return false;
			}
		}
		return true;
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
     int count=1;	
	 long primeNumber=2;
     while(count<10001)
     {
    	 primeNumber++;
    	 if(isPrime(primeNumber))
    	 {
    		 count++;
    	 }
     }
     System.out.println("10001st prime number is : "+primeNumber);
	}
}
//output: 104743
