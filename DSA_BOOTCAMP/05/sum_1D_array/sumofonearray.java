package sum_1D_array;

public class sumofonearray
 {
   public static void main(String[]args)  
   {
    int [] nums={1,2,3,4};
    int [] ans=new int[nums.length];
    int sum=0;
    for(int i=0;i<nums.length;i++)
    {
        sum+=nums[i];
        ans[i]=sum;
    }
    for(int a:ans)
    {
        System.out.print(a+" ");
    }
   }
}
