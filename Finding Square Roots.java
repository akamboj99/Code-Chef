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
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    for(int i=0;i<t;i++)
		    {
		        int sqr=0;
		        int num=sc.nextInt();
		        sqr=(int)Math.sqrt(num);
		        
		        System.out.println(sqr);
		    }
		    
		}
		catch(Exception e)
		{
		    return;
		}
	}
}
