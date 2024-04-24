import java.util.ArrayList;
import java.util.Scanner;

public class posneg {

    public static void main(String[] args) {
        int negsum=0;
        int poseven=0;
        int posod=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numebrs and 0 to stop");
        while (true)
         {
           int input = sc.nextInt();
           if(input==0)
           {
            break;
           }
           else
           {
              if(input<0)
              {
                negsum+=input;
              }
              else if(input%2==0)
              {
                poseven+=input;
              }
              else
              {
                posod+=input;
              }
           }
           
        }
        System.out.println("Sum of negative numbers : "+negsum);
        System.out.println("Sum of Positive even numebrs : "+poseven);
        System.out.println("Sum of positive odd numbers : "+posod);
    }
}