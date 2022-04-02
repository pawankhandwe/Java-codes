import java.util.Scanner;

public class fibonicci {
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);

        System.out.println("enter n");
        int n=kb.nextInt();

        int a=0,b=0,c=1;
        System.out.println("fibonnici series of "+n+" is :-");

        for(int i=0;i<=n;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print("\t,"+a);
        }
        
    }
    
}
