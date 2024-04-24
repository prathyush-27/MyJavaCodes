class BinarySearch
{
    public static void main(String [] args)
    {
        int arr[]={1,5,9,12,15,17,23,28};
        int target = 100;
        int result=bsearch(arr, target);
        System.out.println("\n"+result);
    }
    public static int bsearch(int arr[], int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];  
        while(start<=end)
        {
           int mid=(start+end)/2;
           if(target==arr[mid])
            {
                return mid;
            }
            if(isAsc==true)
            {
                if(target<arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if(target>arr[mid])
                {
                    end=mid+1;
                }
                else
                {
                    start=mid-1;
                }
            }
        }
        return -1;
        
    }
}