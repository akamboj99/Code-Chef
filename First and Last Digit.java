import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i = 0; i < t; i++)
	    {
	        int num = sc.nextInt();
	        int sum = num % 10;
	        while(num != 0)
	        {
	            if(num / 10 == 0)
	                sum += num % 10;
	            num /= 10;
	        }
	        System.out.println(sum);
	    }
	}
}
