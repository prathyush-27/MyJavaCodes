//Session bean 

import java.rmi.RemoteException; 
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.ejb.*;


public class BankEJB implements SessionBean {

  	private SessionContext m_context;
	int balance;
	int account_no;
	String cust_name;

	public int getBalance() throws RemoteException{
		return balance;
	}

	public void set_custname(String s) throws RemoteException{
		cust_name=s;
	}

	public String get_custname() throws RemoteException{
		return cust_name;
	}

	public void deposit(int amount) throws RemoteException{
		balance= balance + amount;
	}

	public boolean withdraw(int amount) throws RemoteException{
		if (amount < balance){
			balance = balance - amount;
			return true;
		}
		else{
			return false;
		}
	}



   public void ejbCreate(){balance=10000;}

   public BankEJB() {}

   public void ejbRemove() {}
   public void ejbActivate() {}
   public void ejbPassivate() {}
   public void setSessionContext(SessionContext sc) {m_context = sc; System.out.println("session context assigned");}
}