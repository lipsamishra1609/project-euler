//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int number=0;
        int n=2520;
        for(int i=1;i<=20;i++)
        {
           if(n%i==0)
           {
        	   if(i==20)
        	   {
        	   number=n;
        	   break;
        	   }
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
