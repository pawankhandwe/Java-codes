public class removeduplicate {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,1,2,3,2,2,2,2,3,4,4,4,4};
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            if(arr[i]==arr[j])
            {
               arr[j]=0;
             
            }
        }
        }
    
      int brr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
            brr[i]=arr[i];
            System.out.println(brr[i]);
            }
        }


    }
    
}
