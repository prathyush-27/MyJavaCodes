package char_ascii;

import java.util.*;

public class char_ascii
{
    public static void main(String[] args) 
    {
        int odd=0;
        int even=0;
        Scanner sc= new Scanner(System.in);
        int range= sc.nextInt();
        char[] ch= new char[range];
        for (int i=0;i<range;i++)
        {
            ch[i]=sc.next().charAt(0);
        }

        for(char c:ch)
        {
            int ascii=(int)c;
            if(ascii%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

       // System.out.println("Even : "+even+"\n Odd : "+odd);

       if(even>odd)
       {
        System.out.println("Even series");
       }
       else if(odd>even)
       {
        System.out.println("Odd Series");
       }
       else
       {
        System.out.println("Undefined");
       }
    }
}