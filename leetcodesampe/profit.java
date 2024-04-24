public class profit 
{
    public static void main(String[] args)
    {
        int arr[]={3,2,1,4,9};
        findProfit(arr);
    }
    public static void findProfit(int arr[])
    {
        int min=arr[0];
        int max=0;
        

        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i]-min;
            if(temp>max)
            {
                max=temp;
            }

            if(arr[i]<min)
            {
                min = arr[i];
            }
        }

        System.out.println("Profit = "+max);
    }
}
