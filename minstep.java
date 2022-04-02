public class minstep {
    public static void main(String[] args) {
        int arr[]={};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
             count++;
             else if(arr[i]==1&&arr[i]==-1)
             {
                 arr[i]=arr[i];
             }else if(arr[i]>0)
             {
                 int t=arr[i]-1;
                 count+=t;
             }else if(arr[i]<0)
             {
                 int temp=arr[i];
                 int c=0;
                 while(temp!=-1)
                 {
                     temp++;
                    c++;
                 }
                 count+=c;
                 
             }
        }

    System.out.println(count);


    }
    
}
