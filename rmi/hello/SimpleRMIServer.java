import java.rmi.*;
public interface SimpleRMIServer extends Remote
{
    String sayHello() throws RemoteException;
}