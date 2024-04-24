package EOF;

import java.util.*;
public class end_of_file
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(sc.hasNextLine())
        {
            String line=sc.nextLine();
            System.out.println(i+" "+line);
            i++;
        }
    }
}