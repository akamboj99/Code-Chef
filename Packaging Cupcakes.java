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
		    Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
		    a[i]=scn.nextInt();
		    
		        int c= a[i]/2 + 1;
		        System.out.println(c);
		    
		}
		} catch(Exception e) {
		}
	}
}
