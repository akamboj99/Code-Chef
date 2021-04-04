
import java.util.*;
import java.io.*;


// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) {
		// System.in and System.out are input and output streams, respectively.
		
		try{
		    Scanner sc=new Scanner(System.in);
		
		long n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    long a=sc.nextInt();
	     	long b=sc.nextInt();
		    long sum =a+b;
		    System.out.println(sum);
		}
		
			//Your Solve
		}catch(Exception e){
			return ;
		}
		
		
	}
}
