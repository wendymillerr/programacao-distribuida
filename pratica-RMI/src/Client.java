import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws Exception {

        try{
            Ola stub = (Ola) Naming.lookup("rmi://localhost:1099/Ola");
            System.out.println(stub.digaOla());
            
        }catch(MalformedURLException | RemoteException | NotBoundException e){
            e.printStackTrace();
        }
    }
}
