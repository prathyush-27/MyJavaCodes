package array_permutation;

//import java.lang.reflect.Array;

class solution
{
    public static void main(String[]args)
    {
    int [] nums={0, 2, 1, 5, 3, 4};
    int [] ans= new int[nums.length];
    int temp;
    for (int i=0;i<nums.length;i++)
    {
        temp=nums[i];           //ans[i]=nums[nums[i]];
        ans[i]=nums[temp];
    }
    
    // for (int a:ans)
    // {
    //     System.out.print(a+"");
    // }
    // }
    System.out.println(ans);
}
}