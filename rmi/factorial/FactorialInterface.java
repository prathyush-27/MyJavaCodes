import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FactorialInterface extends Remote {
    long calculateFactorial(int n) throws RemoteException;
}
