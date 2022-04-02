public class removestring {
    public static void main(String[] args) {
        String  s="abbcd";
        StringBuilder str=new StringBuilder(s);
        boolean flag=true;
       while(flag)
{
           flag=false;
        for(int i=0;i<str.length()-1;i++)
        {
         if(str.charAt(i)==str.charAt(i+1))
            {
            str.delete(i,i+2);
            flag=true;
            System.out.println(str.toString());
           
            }
        }
}

        if(str.length()==0)
        System.out.println("empty string");
        else
        System.out.println(str.toString());
        
    }
    
}
