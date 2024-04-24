public class nallas 
{
    public static void main(String[] args) 
    {
        int i=7;
        int c=0;
        int sum=0;
       while(true)
       {
        if(i%2==0 && i%7==0)
        {
            System.out.println(i);
            c++;
            if(c%3==0)
            {
                sum=sum+i;
                System.out.println("Added no : "+c+" sum so far : "+sum);
            }
        }
        if(sum>=1000)
        {
            break;
        }
        i++;
       }
       System.out.println("Sum : "+sum);
    }
    
}