package great_no_candy;

import java.util.Arrays;

public class great_no__candy 
{
    public static void main(String[]args)
    {
        int []candies={2,3,5,1,3};
        int maxCandy=candies[0];
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>maxCandy)
            {
                maxCandy=candies[i];
            }
        }
        boolean []result=new boolean[candies.length];
        int extra_candies=3;
        for(int i=0;i<candies.length;i++)
        {
            int temp=0;
            temp=candies[i]+extra_candies;
            result[i]= temp>=maxCandy;
        }
        for(boolean a:result)
        {
            System.out.print(a+" ");
        }
    }
}
