import java.util.Scanner;

public class array1 {
    public static void main(String args[])
    {
        int arr[]=new int[5];
        Scanner kb=new Scanner(System.in);
        for(int j=0;j<5;j++)
        {
            arr[j]=kb.nextInt();
        }
        
System.out.println("see the input array");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }

    }
    
}
