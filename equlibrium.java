public class equlibrium {

    public static void main(String []args)
    {
        int array[]={4 ,42 ,27 ,16 ,28 ,3 ,4 ,5 ,9 ,3 ,31 ,5 ,5 ,29 ,10 ,18 ,35 ,35 ,33 ,19 ,41 ,23 ,8 ,32 ,9 ,5 ,8 ,18 ,35 ,13 ,6 ,7 ,6 ,10 ,11 ,13 ,37 ,2 ,25 ,7 ,28 ,43};

        System.out.println("elements of arrays are :- ");
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+",");
            sum=sum+array[i];
        }
        int right=0,left=0;
        right=sum;
           System.out.println();
        for(int i=0;i<array.length;i++)
        {
            right=right-array[i];
            if(right==left)
            {
                System.out.println("equilibrium element of array is  "+array[i]);
                System.out.println("index of equilibrium element is "+i);
                break;
            }
            left=left+array[i];
        }

    



    }
    
}
