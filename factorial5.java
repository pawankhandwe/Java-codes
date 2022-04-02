class usefactorial5
{
    int factt(int n)
    {
        if(n>0)
        return n*factt(n-1);
        else 
        return 0;
    }
}
public class factorial5
{
    public static void main(String[] args) {
        usefactorial5 obj=new usefactorial5();
        int n=5;
        int result=obj.factt(n);
        System.out.println(result);
    }
}
