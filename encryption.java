import java.util.ArrayList;
import java.util.List;

public class encryption {

    public static void main(String[] args) {
        
        String s="iffactsdontfittotheorychangethefacts";

        int l=s.length();
    
    int row=(int)Math.sqrt(l);

    System.out.println(row);
    int column=row+1;
    
    if(row*column<l)
    row=column;
    System.out.println(column);
    char[]arr=s.toCharArray();
    
    List<String> brr=new ArrayList<>();

    String add="";
   int count=0;

   for(int i=0;i<row;i++)
   {
       for(int j=0;j<column;j++)
       {    
             if(count<l)
             {
              add=add+arr[count];
             count++;
             }
       }
       brr.add(add);
       add="";
   } 
System.out.println(brr);

  String result="";
  String temp="";
       
  
  
            for(int i=0;i<column;i++)
            {
                for(int j=0;j<row;j++)
                {
                      temp=brr.get(j);
                    if(i<temp.length())
                      result=result+temp.charAt(i);

                }
                result=result+" ";
               
               
            }
    System.out.println(result);


    }
    
}
