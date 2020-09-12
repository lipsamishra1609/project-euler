//Find the sum of all the primes below two million.
public class prog10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       long sum=2;
	   for(long n=3;n<2000000;n++)
		{
		   int check=0;
	       for(long i=2;i*i<=n;i++)
           {
			  if(n%i==0)
			  {
				check=1;
				break;
			  } 
	       }
	       if(check==0)
	       {
	    	   sum=sum+n;
	       }
		}
		System.out.println(sum);
	}

}
//output: 142913828922
