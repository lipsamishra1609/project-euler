//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class q5 {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number=0,n=2520,i=2;
        while(i<=20)
        {
           if(n%i==0)
           {
        	   if(i==20)
        	   {
        	   number=n;
        	   break;
        	   }
        	   i++;
           }
           else
              {
        	   n++;
        	   i=1;
              }
        }
        System.out.println("the smallest integer divisible : "+number);
     }
}
//output: 232792560
