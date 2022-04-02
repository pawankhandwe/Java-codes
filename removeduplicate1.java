import java.util.*;
import java.util.stream.Collectors;

public class removeduplicate1 {
    public static void main(String[] args) {
        int arr[]={7,2,2,3,4,4,4,5,6,7,5,5,4};

    List<Integer>list=Arrays.stream(arr).boxed().collect(Collectors.toList());
        Set<Integer>s=new HashSet<>(list);
     System.out.println(s);
      }
}