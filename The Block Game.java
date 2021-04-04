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
		    Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	    while(n-->0)
	    {
	        int x=s.nextInt();
	        int num=x;
	        int r=0;
	        while(x!=0)
	        {
	        int d=x%10;
	        r=r*10+d;
	        x=x/10;
	        }
	        if(r==num)
	        System.out.println("wins");
	        else
	        System.out.println("loses");
		} 
		}
		catch(Exception e) {
		    return;
		} 
	}
}
