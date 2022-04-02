import javax.sound.sampled.SourceDataLine;

public class appendanddelete {
    public static void main(String[] args) {
        
    String  s="hackerday";
    String t="hackerrank";
int count=0;
    if(s.equals(t))
    System.out.println("Yes");
else 
{
     for(int i=0;i<s.length();i++)
    {
       if(t.charAt(i)!=s.charAt(i))
       count++;
        
    } 

}

System.out.println(count);
    
    

    }
}
