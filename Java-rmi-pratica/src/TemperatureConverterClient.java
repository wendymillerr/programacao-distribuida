import java.rmi.*;
import java.util.Scanner;

public class TemperatureConverterClient {

   public static void main(String[] args) {
      try {
         Scanner scanner = new Scanner(System.in);
         TemperatureConverter converter = (TemperatureConverter) Naming.lookup("rmi://localhost:1100/TemperatureConverter");
         System.out.print("Enter temperature in Celsius: ");
         double celsius = scanner.nextDouble();
         double fahrenheit = converter.celsiusToFahrenheit(celsius);
         System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
      } catch (Exception e) {
         System.err.println(e);
      }
   }
}