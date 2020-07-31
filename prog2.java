import java.util.*;
public class prog2 {
public static boolean IsPrime(long n)
{
	int flag=1;
	for(int i=2;i<=n/2;i++)
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
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
        long n=sc.nextLong();
        long max=0;
        for (int i=2;i<=n/2;i++)
        {
        	if(n%i==0)
        	{
        		if(IsPrime(i)==true)
        		{
        		System.out.println("prime factor are  "+i);
        		max=i;
                }
             }
         }
        System.out.println("maximum prime factor "+max);
     }
}
