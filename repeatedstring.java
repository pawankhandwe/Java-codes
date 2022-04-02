public class repeatedstring {
    public static void main(String[] args) {
        
    
    
         String s="a";
         long n=1000000000000l;
         long len=0l;
        if(n>s.length())
        {
         len=n-s.length();
        char[] arr=s.toCharArray();
         long count=0l;
        for(long i=0l;i<len;i=i+3)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(count<len)
                {
                s=s+arr[j];
                count++;
                }
            }
        }
   
    }
   
   System.out.println(s);
   
   char []brr=s.toCharArray();
   long l=0l;
         for(int i=0;i<brr.length;i++)
    {
        if(brr[i]=='a')
        l++;
    }  

    System.out.println(l);

}
}
