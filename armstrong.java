import java.util.Scanner;

public class armstrong {

    public static void main(String args[])
    {
          Scanner kb=new Scanner(System.in);
          System.out.println("enter n");
          int n=kb.nextInt();

          int n1;
          n1=n;
          int i=0;
          while(n1!=0)
          {
              i++;
              n1=n1/10;
          }
          int n2=n;
          int temp=0;
          int res=0;

          while(n2!=0)
          {
             temp=n2%10;
             res=(int)(res+Math.pow(temp,i)); 
             n2=n2/10;

          }

        if(n==res)
        System.out.println("it is armstrong");
        else
        System.out.println("it is not armstrong");
          
       

    }
    
}
