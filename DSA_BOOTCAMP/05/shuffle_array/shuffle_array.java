package shuffle_array;

public class shuffle_array 
{
    public static void main(String []args)    
    {
        int [] nums={2,5,1,3,4,7};
        int []ans=new int[nums.length];
        int[] x = new int[nums.length/2];
        int[] y = new int[nums.length/2];
        int n=3;
        if(n*2==nums.length)
        {
            //System.out.print("hello");
            for(int i=0;i<nums.length/2;i++)
            {
                x[i]=nums[i];
                //System.out.print(x[i]);
            }
            for(int i=nums.length/2;i<nums.length;i++)
            {
                y[i-nums.length/2]=nums[i];
                //System.out.print(y[i-nums.length/2]);
            }
            
            int k=0;
            for(int i=0;i<n;i++)
            {
                ans[k]=x[i];
                k++;
                ans[k]=y[i];
                k++;
            }
            for(int a:ans)
            {
                System.out.print(a+" ");
            }
        }
        else
        {
            System.out.println("Invaid Size");
        }
    }
}
