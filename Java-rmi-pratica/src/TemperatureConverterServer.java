import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;;


public class TemperatureConverterServer {
    public static void main(String[] args) throws Exception {
        try{
            LocateRegistry.createRegistry(1100);
            TemperatureConverter temperatureConverter = new TemperatureConverterImpl();
            Naming.rebind("rmi://localhost:1100/TemperatureConverter", temperatureConverter);
            System.out.println("Servidor RMI iniciado.");
        }catch(Exception e){ 
            System.out.println("Erro ao iniciar o servidor RMI: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
