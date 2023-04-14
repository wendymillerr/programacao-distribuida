import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) throws Exception {
       try{
        HelloImpl obj = new HelloImpl();

        Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);
        Registry registry = LocateRegistry.getRegistry();
        registry.bind("Hello", stub);

        System.out.println("Servidor pronto...");


       }catch(Exception e){
        System.out.println("Erro no servidor: " + e.toString());
        e.printStackTrace();
       }



    }
}
