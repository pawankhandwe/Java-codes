public class anagram2 {
    public static void main(String[] args) {
        
        String s="abcd";
        String s1="bdca";

        int Char=256;
        int count[]=new int[Char];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
            count[s1.charAt(i)]--;
        }
        for(int i=0;i<Char;i++)
        {
            if(count[i]!=0)
            {
            System.out.println("false");
            break;
            }
        }
        System.out.println("true");
    }
    
}
