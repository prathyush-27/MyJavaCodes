import java.util.*;
public class new
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Range : ");
        int range =sc.nextInt();
        ArrayList<Integer> ar= new ArrayList<Integer>();
        
        for(int i=2;i<=range;i++)
        {
            if(isPrime(i))
            {
                ar.add(i);
            }
        }
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}