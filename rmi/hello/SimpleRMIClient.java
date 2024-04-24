import java.rmi.*;
public class SimpleRMIClient
{
    public static void main(String[] args) {
        try{
            SimpleRMIServer server=(SimpleRMIServer)Naming.lookup("rmi://localhost/SimpleRMIServer");
            String message = server.sayHello();
            System.out.println("Message from RMI server :  "+message);
        }catch(Exception e){e.printStackTrace();}
    }    
}
