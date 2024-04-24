import java.rmi.Remote;
import java.rmi.RemoteException;

public interface addInterface extends Remote {
    int add(int a, int b) throws RemoteException;
}
