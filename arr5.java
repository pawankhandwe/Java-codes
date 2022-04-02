import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arr5 {

    public static void main(String args[]) 
     {
        List<Integer>l=new ArrayList<Integer>();
        l.add(4);
        l.add(3);
        l.add(76);
        l.add(43);
        l.add(12);

        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }
        Collections.sort(l);
        


     }



    
}
