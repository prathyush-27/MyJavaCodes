import java.rmi.*;
import java.rmi.server.*;
public class SimpleRMIServerImpl extends UnicastRemoteObject implements SimpleRMIServer
{
    public SimpleRMIServerImpl() throws RemoteException
    {
        super();
    }

    @Override
    public String sayHello() throws RemoteException 
    {
        return "Hello from the server";
    }

    public static void main(String[] args) 
    {
        try
        {
            SimpleRMIServerImpl server=new SimpleRMIServerImpl();
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            java.rmi.Naming.rebind("SimpleRMIServer",server);
            System.out.println("Server is running");
        }    
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
