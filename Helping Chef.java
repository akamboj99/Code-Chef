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
		    int t;
		    Scanner sc=new Scanner(System.in);
		    t=sc.nextInt();
		    int n;
		    for(int i=0;i<t;i++)
		    {
		        n=sc.nextInt();
		        if(n<10)
		        {
		            System.out.println("Thanks for helping Chef!");
		        }
		        else
		        {
		            System.out.println("-1");
		        }
		    }
		} 
		
		catch(Exception e) {
		    return;
		} 
	}
}
