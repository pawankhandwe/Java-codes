import java.util.Scanner;

/**
 * table
 */
public class table {

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
       System.out.println("table of what you want");
       int n=kb.nextInt();


       for(int i=1;i<11;i++)
       {
           System.out.println(n+"*"+i+"="+n*i);
       }


    }
}