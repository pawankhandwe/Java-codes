public class missing {

    public static void main(String args[])
    {
      
        int n=5;
        int arr[]={6,2,1,4,5};

        int total;

        total=(n+1)*(n+2)/2;

        for(int i=0;i<n;i++)
        {
            total=total-arr[i];
        }
          System.out.println("missing element is "+total);

    }
    
}
