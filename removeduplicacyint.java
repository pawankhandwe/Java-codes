import java.util.ArrayList;

public class removeduplicacyint {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3,3};
        int n=arr.length;
        ArrayList<Integer>l=new ArrayList<>();
 boolean flag=false;
    for (int i = 0; i < n; i++) 
        {
            int index = arr[i] % n;
            arr[index] += n;
        }

        // Now check which value exists more
        // than once by dividing with the size
        // of array
        for (int i = 0; i < n; i++) 
        {
            if ((arr[i] / n) >= 2)
            {
                l.add(i);
                flag=true;
            }
        }
   
   
   if(flag==true)
   System.out.println(l);
   else{
   l.add(-1);
   System.out.println(l);
   }
    }
}
