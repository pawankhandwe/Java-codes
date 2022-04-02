public class sumdigit {
    public static void main(String args[])
    {
        int n=1234;
int ans=0;
          while(n!=0)
          {
             ans=ans%n;
             ans=ans/n;
          }
        System.out.println("sum of digit "+n+" is "+ans);
    }

    private static int sum(int n) {
        if(n==0)
        return 0;
        else
        return sum(n/10)+(n%10);
    }
    
}
