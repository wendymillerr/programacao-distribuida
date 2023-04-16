import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class OlaImpl extends UnicastRemoteObject implements Ola {

    protected OlaImpl() throws RemoteException {
        super();
    }

    @Override
    public String digaOla() throws RemoteException{
        return "Olá, mundo!";

    }
}
