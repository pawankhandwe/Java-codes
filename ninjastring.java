
import java.util.HashMap;
import java.util.Iterator;

import javax.xml.transform.stream.StreamSource;


public class ninjastring {
    public static void main(String[] args) {
        
        int arr[]={5 ,3, 1, 5, 1, 3, 4, 7, 4 ,8 ,8 };
        HashMap<Integer,Integer>hm=new HashMap<>();
        int a=0;
        hm.put(arr[0],1);
        
        for(int i=1;i<arr.length;i++)
        {
             
             
            if(hm.containsKey(arr[i]))
            {
               int x=hm.get(arr[i]);
                hm.put(arr[i],x+1);
            }else
            {
                hm.put(arr[i],1);
            }
            int x=hm.get(arr[i]);
            
            if(x<2)
            {
                a=arr[i];
            }
            
        }
         System.out.println(hm);

    
           
    }
    
}
