public class ceil
 {
    public static void main(String[] args) 
    {
        int arr[]={2, 3, 5, 9, 14, 16, 18};
        int target=7;
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
            {
                System.out.println("target found : "+arr[i]);
                flag=true;
                break;
            }
            else if(target<arr[i])
            {
                System.out.println("Ceil value is :"+arr[i-1]);
                flag=true;
                break;
            }
           
        }
        if(!flag)
        {
            System.out.println("-1");
        }

    }
    
}