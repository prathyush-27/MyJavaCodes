 import java.util.*;
public class score
{
    public static void main(String[]args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Total No.of Overs to be played : ");
        int TotalOvers=sc.nextInt();
        int TotalNoofBalls=6;
        int[][]score=new int[TotalOvers][TotalNoofBalls];
        for(int over=0 ;over< TotalOvers;over++)
        {
            System.out.println("Over "+(over+1)+" : ");
            for(int ball=0;ball<TotalNoofBalls;ball++)
            {
                System.out.print("Ball "+(ball+1)+":");
                String input=sc.next();

                if(input.equals("wd")||input.equals("nb"))
                {
                   if( ball>0) 
                   {
                    score[over][ball]=score[over][ball]+1;
                   }
                   else
                   {
                    score[over][ball]=1;
                   }
                    System.out.println("Extra Run :");
                    int extraruns=sc.nextInt();
                    score[over][ball]+=extraruns;
                    int[]newScore=new int[score[over].length+1];
                    System.arraycopy(score[over],0,newScore,0,score[over].length);
                    newScore[newScore.length-1]=extraruns;
                    score[over]=newScore;
                    ball--;
                }
                else
                {
                    score[over][ball]=Integer.parseInt(input);
                }
            }
        }
        for(int over=0;over<TotalOvers;over++)
        {
            System.out.println("Over "+(over+1)+": ");
            for(int ball=0;ball<score[over].length;ball++)
            {
                System.out.print(score[over][ball]+" ");
            }
            System.out.println();
        }
    }
}