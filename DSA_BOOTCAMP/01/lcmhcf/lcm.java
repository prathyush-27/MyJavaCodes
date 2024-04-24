package lcmhcf;

import java.util.Scanner;

public class lcm 
{
    public static void main(String[]args)    
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number 1 :");
        int num1=sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int num2=sc.nextInt();
        int max_num;
        if(num1>num2)
        {
           max_num=num1;
        }
        else
        {
             max_num=num2;
        }
        
        int lcm=max_num;
        while(true)
        {
            if(lcm%num1==0 && lcm%num2==0)
            {
                break;
            }
            lcm+=max_num;
        }
        System.out.println("LCM : "+lcm);
    }
}
