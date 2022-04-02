import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);

        int n=kb.nextInt();
int total=1;
        if(n==0)
        System.out.println(1);
        else
       {
           for(int i=1;i<=n;i++)
           {
               total=total*i;
           }
System.out.println(total);




        }






    }
    
}
