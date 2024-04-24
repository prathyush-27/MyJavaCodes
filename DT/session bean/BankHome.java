//Home Interface for test EJB's
import java.io.Serializable;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.*;

public interface BankHome extends EJBHome
{
	public BankRemote create() throws RemoteException, CreateException;

        
}