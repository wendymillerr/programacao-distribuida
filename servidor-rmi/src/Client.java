import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;



public class Client {
    public static void main(String[] args) {
        try{    
            
            Registry registry = LocateRegistry.getRegistry();
            Hello stub = (Hello) registry.lookup("Hello");
            String response = stub.sayHello();

        }catch(Exception e){
            System.out.println("Erro no cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}
