//Remote interface for test EJB's
import javax.ejb.*;
import java.rmi.RemoteException;

public interface BankRemote extends EJBObject
{
	public int getBalance() throws RemoteException;
	public String get_custname() throws RemoteException;
	public void set_custname(String s) throws RemoteException;
	public void deposit(int amount) throws RemoteException;
	public boolean withdraw(int amount) throws RemoteException;
}