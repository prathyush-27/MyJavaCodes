
import java.util.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;



public class studClient {

   public static void main(String[] args) {

       try {

System.out.println("within Client Program....\n");

           Context initial = new InitialContext();

System.out.println("Before Lookup....\n");


           Object objref = initial.lookup("mani");


           studHome home = 
               (studHome)PortableRemoteObject.narrow(objref, 
                                            studHome.class);

System.out.println(".....1.......\n\n\n");


         stud earlin = home.create("s11","Sachin",60);



          stud karthick = home.create("s21","Karthick",75);

       
 	stud sachin = home.create("s31","Dravid",45);



          stud sourav = home.create("s41", "Sourav",33);

       
           stud s = home.findByPrimaryKey("s41");
           System.out.println(s.getname() + ": " + s.getage());


           stud s2 = home.findByPrimaryKey("s11");
           System.out.println(s2.getname() + ": " + s2.getage());


       } catch (Exception ex) {
           System.err.println("Caught an exception." );
           ex.printStackTrace();
       }
   } 
} 
