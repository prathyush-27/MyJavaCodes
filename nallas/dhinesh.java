import java.util.ArrayList;
import java.util.Scanner;

public class dhinesh 
{
    public static void main(String[] args) 
    {
        ArrayList <Integer> arr=new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Rnge : ");
        int range=sc.nextInt();
        
        System.out.println("Enter x number : ");
        int task=sc.nextInt();
        
        int sum=0;
        
        for(int i=2;i<=range;i++)
        {
         if(isPrime(i))
         {
            arr.add(i);

         }
         }
         System.out.println(arr+"\n");
        for(int i=task-1;i<arr.size();i=i+task)
        {
            if(splitcheck(arr.get(i))%4 != 0)
            {
                System.out.println("added element : "+arr.get(i));
                sum=sum+arr.get(i);
            }
        }
        System.out.println("Sum = "+sum);
          
    }

    private static int splitcheck(int b)
    {
        int sum=0;
        while(b!=0)
        {
            int digit=b%10;
            sum=sum+digit;
            b=b/10;
        }

        if(sum>9)
        {
            splitcheck(sum);
        }
        return sum;
    }

    private static boolean isPrime(int x) 
    {
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
