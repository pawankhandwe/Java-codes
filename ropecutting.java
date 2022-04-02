public class ropecutting {
    
    public static void main(String args[])
    {
        int n=5,a=2,b=5,c=1;
        int res=maxpiece(n,a,b,c);
    System.out.println("ans is "+res);
    }

    private static int maxpiece(int n, int a, int b, int c) {
        
        if(n==0)
        return 0;
        if(n<0)
        return -1;

        int res=Math.max(maxpiece(n-a,a,b,c),maxpiece(n-b,a,b,c));
        res=Math.max(res,maxpiece(n-c,a,b,c));
        
        if(res==-1)
        return -1;
        return res+1;
    }
}
