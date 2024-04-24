public class thirdlargest
 {
    public static void main(String[] args)
     {
        int arr[]={12,35,1,10,34,1};
        int one=0;
        int two=0;
        int three=0;
        for(int i=0;i<arr.length;i++)
        {
            if(one<arr[i])
            {
                three=two;
                two=one;
                one=arr[i];
            }
            else if(two<arr[i]&& three<arr[i])
            {
                three=two;
                two=arr[i];
            }
            else if ((arr[i]>two&&arr[i]>three)) 
            {
                three=arr[i];
            }
            
        }
        System.out.println("Third Big element is : "+three);
    }
}
