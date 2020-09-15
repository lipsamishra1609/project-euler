//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class q5 {
	
	public static long gcd(long a, long b)
	{
		long gcd=1;
		for(long i=1;i<=a&&i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				gcd=i;
			}
		}
		return gcd;
	}
	
	public static long lcm(long n)
	{
		long multiple=2520;
		for(long i=11;i<=n;i++)
			multiple=(multiple*i)/gcd(multiple,i);
		    return multiple;
	  	
	}
	
	public static void main(String[]args)
	{
		long number=20;
		System.out.println(lcm(number));
	}
}
//output: 232792560
