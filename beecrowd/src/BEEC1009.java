import java.util.Scanner;

public class BEEC1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        double salary = input.nextDouble();
        double totalSales = input.nextDouble();

        double bonus = totalSales * 0.15;

        double totalSalary = salary + bonus;

        System.out.println("TOTAL = R$ " + String.format("%.2f", totalSalary));
    }
}