public class single 
{
    public static void main(String[] args) {
        int n=38;
        int num=n;
        
        while (num>=10)
         {
          int sum=0;
          while (num>0)
           {
            
            sum=sum+num%10;
            num=num/10;       
         } 
         num=sum; 
        }
        System.out.println("sum : "+num);
    }

}
