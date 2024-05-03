import java.util.Scanner;

public class BEEC1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double salary = scanner.nextDouble();
        double totalSales = scanner.nextDouble();

        double bonus = totalSales * 0.15;

        double totalSalary = salary + bonus;

        // Print the seller's name
        System.out.println("TOTAL = R$ " + String.format("%.2f", totalSalary));

        scanner.close();
    }
}