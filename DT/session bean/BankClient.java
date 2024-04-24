import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import java.util.*;
import javax.ejb.*;

import BankRemote;
import BankHome;

public class BankClient 
{

   public static void main(String[] args) 
   {
       try 
       {
          BankHome home;
          BankRemote bean;
      
          
           Context initial = new InitialContext();
System.out.println("Connected!");

           Object objref = initial.lookup("bank4");

	   if(objref == null){System.out.println("couldnot create object");}
           home = 
               (BankHome)PortableRemoteObject.narrow(objref, 
                                            BankHome.class);
 System.out.println("........1......");

           bean = home.create();

 System.out.println("........2......");              


	   bean.set_custname("Prof Vinayaga Moorthy");
	   System.out.println("Customer Name..."+bean.get_custname());
	   System.out.println("\n\nBefore Depositing Rs 5000....\n\n");
	   System.out.println("Balance..."+bean.getBalance());
	   bean.deposit(5000);
	   System.out.println("\n\nAfter Depositing Rs 5000....");
	   System.out.println(bean.getBalance());

	   bean.deposit(12000);

	   System.out.println("\n\nAfter Depositing Rs 12000....");
	   System.out.println(bean.getBalance());



	   if (bean.withdraw(4000)){
		    System.out.println("Successfully withdrawn...");
		    System.out.println("Balance after Withdrawel.."+bean.getBalance());
		}
		else{
	 	    System.out.println("Not enough balance..");	
		}
	
           bean.remove();
       } catch (Exception ex) 
       {
           System.err.println("Caught an unexpected exception!");
           ex.printStackTrace();
       }
   }
} 

