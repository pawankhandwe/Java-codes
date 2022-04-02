public class advpalindrome {
    public static void main(String[] args) {
        
        int n=4;

        StringBuilder sb=new StringBuilder(Integer.toString(n));
        sb.reverse();
        int i=Integer.parseInt(sb.toString());
        int res=i+n;
boolean flag=true;

        while(flag)
        {
         sb=new StringBuilder(Integer.toString(res));
        sb.reverse();
        int ii=Integer.parseInt(sb.toString());
        if(ii==res)
        {
            System.out.println("palindrome of n is"+ii);
            flag=false;
            break;
        }
        res=res+ii;

    }
    }
}
