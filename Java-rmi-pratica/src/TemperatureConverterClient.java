import java.rmi.*;
import java.util.Scanner;


public class TemperatureConverterClient {

   public static void main(String[] args) {
      try {
         Scanner scanner = new Scanner(System.in);
         TemperatureConverter converter = (TemperatureConverter) Naming.lookup("rmi://localhost:1100/TemperatureConverter");
         System.out.println("Digite para qual você quer converter (C ou F): ");
         String tipoTemp = scanner.nextLine();
         System.out.print("Digite a temperatura: ");


         if(tipoTemp.equals("C")){

            double celsius = scanner.nextDouble();
            double fahrenheit = converter.celsiusToFahrenheit(celsius);
            System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");

         }else if(tipoTemp.equals("F")){
            double fahrenheit = scanner.nextDouble();
            double celsius = converter.fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
         }
         
      } catch (Exception e) {
         System.err.println(e);
      }
   }
}