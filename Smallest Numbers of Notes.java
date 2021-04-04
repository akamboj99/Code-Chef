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
		    for(int i=0;i<t;i++)
		    {
		        int result=0;
		        int n=sc.nextInt();
		        int rs[]={100,50,10,5,2,1};
		        for(int j=0;j<6;j++)
		        {
		            if(rs[j]<=n)
		            {
		                result+=n/rs[j];
		                n=n%rs[j];
		            }
		        }
		        System.out.println(result);
		    }
		} 
		catch(Exception e) {
		    return;
		} 
	}
}
