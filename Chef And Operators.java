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
		try{
		    int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n1=sc.nextInt();
		    int n2=sc.nextInt();
		    if(n1<n2)
		    {
		        System.out.println("<");
		    }
		    else if(n1>n2)
		    {
		        System.out.println(">");
		    }
		    else
		    {
		        System.out.println("=");
		    }
		}
		}
		catch(Exception e)
		{
		    return;
		}
	}
}
