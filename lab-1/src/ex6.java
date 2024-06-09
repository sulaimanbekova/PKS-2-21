import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вес на Земле в кг: ");
        double earth = scanner.nextDouble();

        double moon = 0.165;

        double years = 0.032;

        System.out.println("Результаты:");
        for (int year = 1; year <= 15; year++) {

            double moonWeight = earth * moon;
            System.out.printf("%d год: %.3f кг%n", year, moonWeight);


            earth += earth * years;
        }

        scanner.close();
    }
}