//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
public class q2 {
    	
	public static void main(String[] args)
	// TODO Auto-generated method stub
   {
		int a=0;
		int b=1;
		int c=0;
		int sum=0;
		while(c<4000000)
		{
			c=a+b;
			if(c%2==0)
			{
				sum=sum+c;
			}
			a=b;
			b=c;
		}
		System.out.println("sum : "+sum);
	}
}

//output : 4613732
