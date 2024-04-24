import java.util.Collection;
import java.rmi.RemoteException;
import javax.ejb.*;

public interface studHome extends EJBHome {

    public stud create(String studId, String name, 
        int age) throws RemoteException, CreateException;
    
    public stud findByPrimaryKey(String studId) 
        throws FinderException, RemoteException;
   
 }
