public class rotate {
    public static void main(String[] args) {
        
        int arr[]={2,3,4,5,6,7,8};
        int n=arr.length;
        int d=1;
        int i=0;
        int brr[]=new int[d+1];
        
        int k=d;int l=0;
        while(i<n)
        {
            if(i<k)
            {
                
                brr[i]=arr[i];
                arr[i]=arr[d];
                i++;
                d++;
            }else if(d<n)
            {
            arr[i]=arr[d];
            i++;
            d++;
            }else
            {
                arr[i]=brr[l];
                l++;
                i++;
            }
        }
    

    
for(int x:arr)
System.out.print(x+",");
    }
    
}
