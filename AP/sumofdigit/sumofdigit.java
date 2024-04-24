import java.util.*;
public class sumofdigit
{
    public static int LengthFinder(int num)
        {
        int length=0;
        int tempNum=num;
        while(tempNum!=0)
        {
         length++;
         tempNum/=10;

        }
        
        return length;
        }
    public static int adder(int num)
    {
        int sum=0;
        int tempadd=num;
        while(tempadd!=0)
        {
            int lastDigit=tempadd%10;
            sum+=lastDigit;
            tempadd/=10;
        }
        return sum;
    }
     public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the number : ");
        int num=sc.nextInt();
        int add=num;
        //int length=LengthFinder(add);
        while(add>10)
        {
            add=adder(add);
            //length=LengthFinder(add);
        }
        System.out.println("the value is : "+add);
        
    }
}
