import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Temperature converter ====");
        System.out.println("1. Celsius → Fahrenheit");
        System.out.println("2. Fahrenheit → Celsius");
        System.out.println("3. Celsius → Kelvin");
        System.out.print("Choose (1-3): ");
        int choice = sc.nextInt();

        System.out.println("Deyeri daxil et:");
        double temp = sc.nextDouble();
        double result;

        switch (choice){
            case 1 -> {
                result = (temp * 9 / 5) + 32;
                System.out.println("Nəticə: " + result + " °F");
            }
            case 2 -> {
                result = temp + 273.15;
                System.out.println("Nəticə: " + result + " °k");
            }
            case 3 -> {
                result = (temp - 32) * 5 / 9;
                System.out.println("Nəticə: " + result + " °C");
            }
            default -> System.out.println("Yanlis secim!");
        }
            sc.close();
    }
}
