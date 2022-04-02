public class factorial55 {

    static int fact(int n)
    {
        if(n==0)
        return 1;
        else 
        return(n*fact(n-1));
    }
    public static void main(String[] args) {
        
        int n=5;
        int result=fact(n);
        System.out.println("factorial of "+n+" is "+result);
    }
    
}
