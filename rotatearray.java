public class rotatearray {

    public static void main(String[] args) {
       int arr[]={2,4,6,8,10,12,14,16,18,20};
       int d=3;
       int n=arr.length;
        int k=0;
  int i=0;
  int l=d+1;
  int x=d;
  int brr[]=new int [n];
  while(d<n)
  {
      if(i<x)
      {
      brr[i]=arr[k];
      i++;
      }
     arr[k]=arr[d];
      k++;
      d++;
      
      
  }
  
  if(k>n)
  k=0;
  i=0;
  while(k<n)
  {
      arr[k]=brr[i];
      i++;
      k++;
      
  }
  
  for(k=0;k<n;k++)
  {
     System.out.print(arr[k]+",");
  }

 

  



    }
    
}
