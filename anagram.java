import java.util.Arrays;

import javax.lang.model.util.ElementScanner6;

public class anagram
{
   public static boolean isanagram(String s1,String s2)
    {
       
        Arrays.sort(s1.toCharArray());
        Arrays.sort(s2.toCharArray());
        boolean status = true; 
        if(s1.length()!=s2.length())
        status= false;

        if(s1.equals(s2))
        status=true;

        return status;
          

    }
    public static void main(String[] args) {
        boolean result=isanagram("pawan","napaw");
        System.out.println("it is "+result);

    }
}