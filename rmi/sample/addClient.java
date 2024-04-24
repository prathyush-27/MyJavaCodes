import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class addClient {
    public static void main(String[] args) {
        try {
            // Locate the registry and lookup the remote object by its name
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            addInterface calculator = (addInterface) registry.lookup("CalculatorService");

            // Invoke the remote method
            int result = calculator.add(5, 3);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
