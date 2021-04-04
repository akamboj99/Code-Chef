/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try(Scanner var=new Scanner(System.in)){
		int n=var.nextInt();
        while(n--!=0){
        int a[] = new int[3];
        for(int i=0; i<3; i++){
            a[i] = var.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[1]);
		}
		}
	catch(Exception e){
		//nothing is here.
	}
	}
}
