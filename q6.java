//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int sum1=0;
       int sum2=0;
       for(int i=1;i<=100;i++)
       {   
    	   sum1=sum1 + (i*i);
    	   sum2=sum2 + i;
       }
       System.out.println((sum2*sum2)-sum1);
       
	}

}
//output: 25164150
