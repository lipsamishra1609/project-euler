//What is the largest prime factor of the number 600851475143 
public class q3 {
	public static void main(String[] args) {
	  // TODO Auto-generated method stub
		long n=600851475143L;
	        long i=3;
	        while(i<=Math.sqrt(n))
	        {
	        	if(n%i==0)
	        	{
	        		n=n/i;
	        	}
	        	i=i+2;
	        }
	        System.out.println("Largest prime factor is : "+n);
	     }
}
// output : 6857
