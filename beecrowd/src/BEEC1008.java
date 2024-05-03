import java.util.Scanner;

public class BEEC1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int hoursWorked = scanner.nextInt();
        double hourlyWage = scanner.nextDouble();

        double salary = hoursWorked * hourlyWage;

        System.out.println("NUMBER = " + number);

        System.out.printf("SALARY = U$ %.2f%n", salary);

        scanner.close();
    }
}
