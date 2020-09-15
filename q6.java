//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int sum1=0;
       int sum2=0;
       int n=100;
       sum1 = n * (n+1)/ 2;
       sum2 = (n * (n + 1) * (2 * n + 1)) / 6;
       System.out.println("the difference is : "+((sum1*sum1)-sum2));
       
	}

}
//output: 25164150
