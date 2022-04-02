public class reversearray {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4};
        int l=0;
        int h=3;
        while(l<h)
        {
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
        for(int x:arr)
        System.out.println(x);
    }
    
}
