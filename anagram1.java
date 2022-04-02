public class anagram1 {

    public static void main(String[] args) {
        String s="silent";
        String s1="listen";
         int m=0,n=0;
        if(s.length()==s1.length())
        {
            for(int i=0;i<s.length();i++)
            {  
                m=m+s.charAt(i);
                n=n+s1.charAt(i);
            }
            if(n==m)
            System.out.println("true");
            else 
            System.out.println("false");


        }else
        System.out.println("false");
    }

    
}
