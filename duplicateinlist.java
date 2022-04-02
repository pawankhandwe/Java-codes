import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class duplicateinlist {
  
    public static void main(String[] args) {
        
        List<Integer>a=new ArrayList<Integer>();
        Collections.addAll(a,100,90,90,80);

        Collections.sort(a);
        for(int i=0;i<a.size();i++)
        {
            if(i+1<a.size()&&a.get(i)==a.get(i+1))
            a.remove(i+1);
        }
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        
    }
    
}
