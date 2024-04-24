import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class addImpl extends UnicastRemoteObject implements addInterface {
    protected addImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
