import java.util.Scanner;

public class BEEC1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int code1 = scanner.nextInt();
        int units1 = scanner.nextInt();
        double price1 = scanner.nextDouble();

        int code2 = scanner.nextInt();
        int units2 = scanner.nextInt();
        double price2 = scanner.nextDouble();

        double total = (units1 * price1) + (units2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        scanner.close();
    }
}