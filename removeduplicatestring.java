public class removeduplicatestring {

    public static void main(String[] args) {
        

        String s="ddfffs";  
          s=s.replaceAll(" ","");
     
       StringBuilder sb=new StringBuilder(s);
        boolean flag=true;
        while(flag)
        {
            flag=false;
            for(int i=0;i<sb.length()-1;i++)
            {
                for(int j=i+1;j<sb.length();j++)
                
                {
                if(sb.charAt(i)==sb.charAt(j))
                { 
                    sb.delete(j,j+1);
                    flag=true;
                    System.out.println(sb.toString());
                     
                    
                }
              }
            }
        
        }
      
        
        flag=true;
        while(flag)
        {
            flag=false;
            for(int i=0;i<sb.length()-1;i++)
            {
                for(int j=i+1;j<sb.length();j++)
                
                {
                if(sb.charAt(i)==sb.charAt(j)+32)
                { 
                    sb.delete(j,j+1);
                    flag=true;
                    
                }
                if(sb.charAt(i)==sb.charAt(j)-32)
                { 
                    sb.delete(j,j+1);
                    flag=true;
                    
                }
           

               }
            }
        
        }


       
      String f=sb.toString();
      System.out.println(f);
      int l=f.length();
      System.out.println(l);
      if(l==26)
      System.out.println("yes");
      else 
      System.out.println("no");
        

    }
    
    
}
