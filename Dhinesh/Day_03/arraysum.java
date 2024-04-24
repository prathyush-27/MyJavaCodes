public class arraysum 
{
  public static void main(String[] args)
   {
    int arr[]={1,1,1,1};
    int temp =0;
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=temp+arr[i];
        temp=arr[i];
    }
    for(int x:arr)
    {
        System.out.print(" "+x);
    }
   }
}
