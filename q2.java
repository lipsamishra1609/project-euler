import java.util.*;
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

