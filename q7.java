//What is the 10 001st prime number?
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int count=0,l=0;	
	 long primeNumber=0;
     long i=2;
     while(i>0)
     {
    	 for(long j=1;j*j<=i;j++)
    	 {
    		 if(i%j==0)
    		 {
    			 l++;
    		 }
      	 }
    	 if(l==1)
    	 {
    		 count++;
    	 }
    	 if(count==10001)
    	 {
    		 primeNumber=i;
    		 break;
    	 }
    	 i++;
    	 l=0;
     }

      System.out.println("10001st prime number is : "+primeNumber);
	}

}

//output: 104743
