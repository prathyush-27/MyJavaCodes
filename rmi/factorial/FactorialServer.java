import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class FactorialServer extends UnicastRemoteObject implements FactorialInterface {
    public FactorialServer() throws RemoteException {
        super();
    }

    public long calculateFactorial(int n) throws RemoteException {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            FactorialServer server = new FactorialServer();
            FactorialInterface stub = (FactorialInterface) UnicastRemoteObject.exportObject(server, 0);
            Registry registry = LocateRegistry.createRegistry(1100);
            registry.rebind("MyFactorialServer", stub); // Change the name
            System.out.println("FactorialServer is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
