import java.util.*;


public class test{

    
    public static void main(String args[]) 
    {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no.of elements :");
            int total=sc.nextInt();
            int arr[]= new int[total];
            System.out.println("Enter the elements :");
            for(int i=0;i<total;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the target element : ");
           int target=sc.nextInt();        
            
            int ans=BinarySearch(arr,target);
            if(ans>=0)
            {
              System.out.println("Element in "+ans +" index");
            }
            else
            {
                System.out.println("Element not found");
            }
        }
    }
    public static int BinarySearch(int arr[],int target)
    {
        int start=0;
        int end= arr.length-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target <arr[mid])
            {
                end= mid-1;
            }
            else if(target > arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
