

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface stud extends EJBObject {
 
   public void setage(int age) throws RemoteException;

   public int getage() throws RemoteException;  

   public String getname() throws RemoteException;
}
