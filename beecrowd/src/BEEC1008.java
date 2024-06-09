import java.util.Scanner;

public class BEEC1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int hoursWorked = input.nextInt();
        double hourlyWage = input.nextDouble();

        double salary = hoursWorked * hourlyWage;

        System.out.println("NUMBER = " + number);

        System.out.printf("SALARY = U$ %.2f%n", salary);
    }
}
