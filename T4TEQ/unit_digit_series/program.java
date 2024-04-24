package unit_digit_series;
import java.util.*;
public class program 
{
    public static void main(String[] args) 
    {
        int temp=0;
        int n=0;
       
        int digit=0;
        int revnum=0;
        Scanner sc= new Scanner(System.in);
        int range= sc.nextInt();
       // int arr[]= new int[range];
        for(int i=0;i<range;i++)
        {
            n=sc.nextInt();
            temp=temp*10+ Math.abs(n%10);
        }
        
         int num=temp;
        while (num>0) 
        {
            digit=num%10;
            revnum=revnum*10+digit;
            num=num/10;

        }
        if(temp==revnum)
        {
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }



    }
    
}
