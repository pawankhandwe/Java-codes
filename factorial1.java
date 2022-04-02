import java.util.Scanner;

public class factorial1 {

    public static void main(String args[])
    {
      Scanner kb=new Scanner(System.in);

      System.out.println("enter number to find factorial");
      int n=kb.nextInt();

      if(n==0)
      {
          System.out.println("factorial of 0 is 1");
      }else
      {
          int factorial=1;
          for(int i=1;i<=n;i++)
          {
             factorial=factorial*i;
              
          }

   System.out.println("factorial of "+n+" is "+factorial);


      }

    }
}
