public class finddigit {
    public static void main(String[] args) {
        
        int n=124;
        Integer i=new Integer(n);
        String ii=i.toString(i);

        char[]arr=ii.toCharArray();
 int []brr=new int[arr.length];
        for(int j=0;j<arr.length;j++)
        {
           brr[j]=arr[j];
             
        }
         System.out.println(brr);



    }
    
}
