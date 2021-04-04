/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    
		    for(int i=0;i<t;i++)
		    {
		        int rev=0;
		        int num=sc.nextInt();
		        while(num!=0)
		        {
		            int d=num%10;
		            rev=rev*10+d;
		            num=num/10;
		        }
		        System.out.println(rev);
		    }
		} 
		
		catch(Exception e) {
		    return;
		} 
	}
}
