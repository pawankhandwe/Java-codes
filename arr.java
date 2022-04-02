import java.util.*;
public class arr {
    public static void main(String[] args) {
        
        int n=123;
        Integer i=new Integer(n);
        String s=i.toString();
        String ss;
   
        int arr[]=new int[n];
       int  count=0;
       int index=0;
        for(int j=0;j<s.length();j++)
        {
            for(int k=j;k<s.length();k++)
            {
                 ss=s.substring(j,k+1);
               count=Integer.parseInt(ss);
               arr[index]=count;
               index++;
            }

        }
      for(i=0;i<index;i++)
      {
          System.out.print(arr[i]+",");
      }
    



        
    }
    
}
