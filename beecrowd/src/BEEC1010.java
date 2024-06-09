import java.util.Scanner;

public class BEEC1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int code1 = input.nextInt();
        int units1 = input.nextInt();
        double price1 = input.nextDouble();

        int code2 = input.nextInt();
        int units2 = input.nextInt();
        double price2 = input.nextDouble();

        double total = (units1 * price1) + (units2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}