import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class addServer {
    public static void main(String[] args) {
        try {
            // Create an instance of the implementation class
            addInterface calculator = new addImpl();

            // Create the registry and bind the implementation instance to a name
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("CalculatorService", calculator);

            System.out.println("Server started.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
