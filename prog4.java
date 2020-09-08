import java.util.*;
public class prog4 {

	public static boolean Ispalindrome(long n)	
	{     
		  long sum=0;
		  long cpy=n;
	      while(n>0)
	      {
	    	  long d=n%10;
	    	  sum=sum*10+d;
	    	  n=n/10;
	      }
	      if(cpy==sum)
	      {
	    	  return true;
	      }
	      else
	      {
	    	  return false;
	      }

	}
		    public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			//System.out.println("enter the number");
			//long n=sc.nextLong();
			long mul;
			long lar=0;
			for(int i=100;i<=999;i++)
			{
				for(int j=100;j<=999;j++)
				{
				mul=i*j;
				if(Ispalindrome(mul))
				{
					lar=mul;
				}
				}
			}
			System.out.println(lar);

		}

}
