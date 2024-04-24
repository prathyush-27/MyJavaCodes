package enumexample;

import java.util.Scanner;

enum month{
    january(31),
    february(28),
    march(31),
    april(30),
    may(31),
    june(30),
    july(31),
    august(31),
    september(30),
    october(31),
    novomber(30),
    december(31);
 private int days ;
 month(int days){
    this.days=days;
 }
 public int getDays(){
    return days;
}
}

public class enumex {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a month :");
        String s=sc.nextLine();
        month m=month.valueOf(s.toLowerCase());
        int days=m.getDays();
        System.out.println("The NO.Of days in "+s+"is :"+days);
    }
    
}
