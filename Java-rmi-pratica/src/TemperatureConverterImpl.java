import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TemperatureConverterImpl extends UnicastRemoteObject implements TemperatureConverter {
    public TemperatureConverterImpl() throws RemoteException{
        super();
    }

    public double celsiusToFahrenheit(double celsius) throws RemoteException{
        return (celsius * 1.8) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) throws RemoteException{
        return (fahrenheit - 32) / 1.8;
    }

}
