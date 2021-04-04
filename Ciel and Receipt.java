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
		try 
		{
		    int t;
		    Scanner sc=new Scanner(System.in);
		    t=sc.nextInt();
		    for(int i=0;i<t;i++)
		    {
		        int p=sc.nextInt();
		        int menu[]={2048,1024,512,256,128,64,32,16,8,4,2,1};
		        int result=0;
		        for(int j=0;j<12;j++)
		        {
		            if(menu[j]<=p)
		            {
		                result+=p/menu[j];
		                p=p%menu[j];
		            }
		        }
		        System.out.println(result);
		    }
		} 
		
		catch(Exception e) 
		{
		    return;
		}
	}
}
