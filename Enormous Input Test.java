import java.io.*;
import java.util.*;

public class Main  {
    
        public static void main(String args[])
        {
            try{
                Scanner sc=new Scanner(System.in);
            int n=sc.nextInt(),k=sc.nextInt(),count=0,num;
            for(int i=0;i<n;i++)
            {
                num=sc.nextInt();
                if(num%k==0)
                {
                    count++;
                }
            }
            System.out.println(count);
            }
            catch(Exception e){
                return;
            }
        }
    
}
