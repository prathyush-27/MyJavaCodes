import java.util.Scanner;
import java.lang.System;
enum Item{
        coke(30),
        pepsi(25),
        snickers(20),
        dorittos(20);

    private int price;
    Item(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    }

 public class vendingmachine {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a item : ");
        String s=sc.nextLine(); 
        Item item = Item.valueOf(s.toLowerCase());
        int amount=item.getPrice();
        System.out.println("The Price of "+s+" is :"+amount);
    }

}
