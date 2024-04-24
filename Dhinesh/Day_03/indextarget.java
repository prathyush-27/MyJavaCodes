public class indextarget
{
    public static void main(String[] args)
     {
       int arr[] ={2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
       int target=36;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]==target)
        {
            System.out.println(i);
        }
       }
    }
}