public class convert
{
    public static void main(String[] args) 
    {
      int x=121;
      System.out.println("The givven numebr is : "+palindrome(x));

    }
    public static boolean palindrome(int n)
    {
        int num=n;
        int rev=0;
       while(num>0)
       {
         int a=num%10;
         rev=rev*10+a;
         num=num/10;
       }
       if(n==rev)
       {
        return true;
       }
       else
       {
        return false;
       }
    }
}