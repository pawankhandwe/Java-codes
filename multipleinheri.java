class a
{
   void show()
   {
        }
}
class b extends a
{
    void show()
    {
        System.out.println("its a parent class");
  
     }
}




public class multipleinheri extends b{
    public static void main(String[] args) {

        multipleinheri c=new multipleinheri();
        c.show();
        
    }
    
}
