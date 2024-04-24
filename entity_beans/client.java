
import java.util.*;
public class client extends server
{
    public static void main(String[] args) 
    {
        server ss= new server();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID : ");
        String id = sc.next();

        System.out.println("Enter the Name  : ");
        String name = sc.next();

        System.out.println("Enter the Description : ");
        String description = sc.next();

        System.out.println("Enter the Price : ");
        String price = sc.next();

        ss.display(id, name, description,price);

    }
}