//Find the largest palindrome made from the product of two 3-digit numbers.
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
		    	// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			//System.out.println("enter the number");
			//long n=sc.nextLong();
			long mul;
			long lar=0;
			for(int i=999;i>=100;i--)
			{
				for(int j=999;j>=100;j--)
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

//output : 580085
