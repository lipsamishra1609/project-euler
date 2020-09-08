import java.util.*;
public class prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int product=1000;
		 boolean flag=false;
		 for(int a=1;a<product;a++)
		 {
			 for(int b=a+1;b<product;b++)
			 {
				 int c=product-a-b;
				 if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))
				 {
					 flag=true;
					 System.out.println(a*b*c);
				 }
			 }
		 }
		 if(flag==false)
		 {
			 System.out.println("No such numbers exist.");
		 }
	}

}
