public class min {
    
    public static void main(String[] args) {
        
        int arr[]={28, 7 ,-36 ,21, -21 ,-50 ,9 ,-32};
        int n=8;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=0;
                if(arr[i]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                               
            }
        }
        
        int brr[]=new int[8];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                brr[j]=arr[i];
                j++;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                int temp=0;
                if(brr[i]>brr[j])
                {
                    temp=brr[j];
                    brr[j]=brr[i];
                    brr[i]=temp;
                }
                               
            }
        }
    
        int t=0;
       
        for(int i=0;i<n;i++)
        {
            if(brr[i]!=i+1)
            {
           
                t=i+1;
                break;
            }
        }
        
        if(t>0)
       System.out.println(t);
       System.out.println(n+1);
    }
}
