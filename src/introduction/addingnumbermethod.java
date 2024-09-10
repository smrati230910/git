package introduction;

import java.util.Scanner;

public class addingnumbermethod {


public static  void addmethod(int a, int b) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a value");
	a=sc.nextInt();
	System.out.println("enter b value");
	b=sc.nextInt();
	
	//System.out.println("enter value of a" +sc.nextInt() );
	
	//System.out.println("enter value of b "  +sc.nextInt());
	
	
	 int c=a+b;
	 
	System.out.println(c);
}
	public static void main(String[] args) {
	
	
				
		addingnumbermethod.addmethod(0, 0);
	
	
	
	
}




}
 