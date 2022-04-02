import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class duplicay {
   public static void main(String[] args) {
       
    int arr[]={1,2,3};
    int brr[]={1,2,3,4};

    if(arr.length!=brr.length)
    System.out.println("h");

    Set<Object>hs=new HashSet<Object>(Arrays.asList(arr));
    
    Set<Object>hp=new HashSet<Object>(Arrays.asList(brr));
    Arrays.

    if(hp.size()!=hs.size())
    System.out.println("they are not equal");

    for(Object obj:hp)
    
    if(!hs.contains(hp))
    System.out.println("it is no same");
    

   




   }
    
}
