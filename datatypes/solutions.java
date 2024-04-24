package datatypes;

import java.util.Scanner;

 class solutions {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try{
                System.out.println("Enter the numbers");
                long x =sc.nextLong();
                if(x>Long.MAX_VALUE || x < Long.MIN_VALUE)
                {
                    System.out.println(x+"can't be fitted in anywhere");
                }
                else
                {
                System.out.println(x+"can be fitted in :");
                if(x>= -128 && x<=127)
                {
                    System.out.println("*byte");
                }
                if(x>=-32768 && x<=32767)
                {
                    System.out.println("*short");
                }
                if(x>=-2147483648 && x<=2147483647)
                {
                    System.out.println("*int");
                }
                if(x>=-9223372036854775808L && x<=9223372036854775807L)
                {
                System.out.println("*long");
                }
            }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+"cant fit anywhere");
            }
        }
        sc.close();
    }
}
