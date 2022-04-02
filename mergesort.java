public class mergesort {

    public static void main(String[] args) {
        int arr[]={9,8,7,4,1};
        mergesorts(arr,0,arr.length-1);

        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        
    }

    public static void mergesorts(int[] arr, int first, int last) {
      
        int mid;
        if(first<last)
        {
            mid=(first+last)/2;
            mergesorts(arr, first, mid);
            mergesorts(arr, mid+1, last);
            merge(arr, first, last);
        }


    }

    public static void merge(int[] arr, int first, int last) {

        int temp[]=new int[10];
        int i,i1,i2,i3,mid;
        mid=(first+last)/2;
        i1=0;
        i2=first;
        i3=mid+1; 
        while(i2<=mid&&i3<=last)
        {
            if(arr[i2]<arr[i3])
            {
                temp[i1]=arr[i2];
                i2=i2+1;
            }else
            {
                temp[i1]=arr[i3];
                i3=i3+1;

            }
            i1=i1+1;
        }

    if(i2<=mid)
    {
        while(i2<=mid) 
        {
            temp[i1]=arr[i2];
            i1=i1+1;
            i2=i2+1;
        } 
    }else
    {
        while(i3<=last) 
        {
            temp[i1]=arr[i3];
            i1=i1+1;
            i3=i3+1;
        }

    }
 i=0;
while(i<i1)
{
    arr[first+i]=temp[i];
    i++;
    }
}
    
    
}
