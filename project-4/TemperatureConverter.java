import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== TEMPERATURE CONVERTER =====");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double temp, result;

        switch (choice) {

            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temp = sc.nextDouble();

                result = (temp * 9 / 5) + 32;

                System.out.println("Temperature in Fahrenheit: " + result + " °F");
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temp = sc.nextDouble();

                result = (temp - 32) * 5 / 9;

                System.out.println("Temperature in Celsius: " + result + " °C");
                break;

            case 3:
                System.out.println("Thank You!");
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}