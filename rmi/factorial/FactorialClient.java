import java.rmi.Naming;

public class FactorialClient {
    public static void main(String[] args) {
        try {
            FactorialInterface server = (FactorialInterface) Naming.lookup("rmi://localhost:1100/FactorialServer");
            int n = 5; // Change this number to calculate factorial for a different value
            long result = server.calculateFactorial(n);
            System.out.println("Factorial of " + n + " is " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
