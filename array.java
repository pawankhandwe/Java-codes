import java.util.Scanner;

public class array {
      public static void main(String args[])
      {
          int arr[]=new int [5];
         Scanner kb=new Scanner(System.in);          

          for(int i=0;i<5;i++)
          {
             arr[i]=kb.nextInt();
          }
          System.out.println();
          for(int i=0;i<5;i++)
          {
              System.out.print(arr[i]+",");
          }
         
      }
    
}
