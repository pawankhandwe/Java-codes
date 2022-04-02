import java.util.Scanner;

public class fabonicci
{
   public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
       
       System.out.println("enter how much fabbonici series you want");
       int n=kb.nextInt();
    
       int a=0;
       int b=1;
       int c=1;

       for(int i=0;i<n;i++)
       {
          
           a=b;
           b=c;
           c=a+b;
           System.out.println(a);
       }



   }
}