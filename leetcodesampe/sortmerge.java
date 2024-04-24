public class sortmerge
{
    public static void main(String[] args) {
        int nums1[]={-1,0,0,3,3,3,0,0,0};
         int nums2[]={1,2,2};

        //  for(int i=0;i<nums1.length;i++)

        // {
        //     for(int j=0;j<nums2.length;j++)
        //     {

        //         if(nums1[i]==0 || nums1[i]>nums2[j])
        //         {
        //             int temp=nums1[i];
        //             nums1[i]=nums2[j];
        //             nums2[j]=temp;
        //         }
        //     }
        // }

    int i=nums1.length-1;
    int j=nums2.length-1;
    int k=nums1.length+nums2.length -1;

while (i>=0 && j>=0)
 {
    if(nums1[i]>nums2[j])  
    {
        nums1[k]=nums2[i]
    }
}


        for(int x:nums1)
        {
            System.out.print(x);
        }
    }
}