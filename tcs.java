import java.util.Scanner;

public class tcs {
    public static void main(String[] args) {
        
        int n;
        Scanner kb=new Scanner (System.in);
        n=5;
        int arr[]={2,-7,8,-1,20};

       
        int right=arr[n-1];
        int left=arr[0];

        int p=1;
        int q=n-2;
        for(int i=1;i<n-1;i++)
        {
            if(i%2!=0)
            {
              if(right>left)
              {
                right=right+arr[p];
                p++;
               }else
               {
                   right=right+arr[p+1];
                   p++;
               }
           }else
           {
             if(left>right)
             {
                 left=left+arr[q];
             }else
             {
                 left=left+arr[q-1];
             }   
           }
        }
    System.out.println("left"+left);
    System.out.println("right"+right);
        if(left>right)
        {
            System.out.println(left-right);
        }else
        {
            System.out.println(right-left);
        }



    }
    
}
