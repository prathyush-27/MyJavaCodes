public class sumproduct 
{
    public static void main(String[] args)
     {
        int ans=check(4421);
        System.out.println("Difference is : "+ans);
    }
    public static int check(int n)
    {
        int sum=0;
        int product=1;
        while(n>0)
        {
            int digit=n%10;
            sum=sum+digit;
            product=product*digit;
            n=n/10;  
        }
        return product-sum;


    }
}