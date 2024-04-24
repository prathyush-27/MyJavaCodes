package stopx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stopx 
{
    public static void main(String[]args)    
    {
        Scanner sc =new Scanner(System.in);
        System.out.println(("Enter whatever input and press 'x' to stop  "));
        String input ;
        List<Integer> numbers=new ArrayList<>();
        

        while(true)
        {
            input=sc.nextLine();
            if(input.equalsIgnoreCase("x"))
            {
                break;
            }
        
        try
        {
            int num=Integer.parseInt(input);
            numbers.add(num);
        }catch(Exception e)
        {
            System.out.println("Invalid input");
        }
    }
        System.out.println("Entered numbers are : ");
        for(int number:numbers)
        {
            System.out.println(number);
        }
    }
}
