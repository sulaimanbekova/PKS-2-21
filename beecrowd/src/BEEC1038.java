import java.util.Scanner;

public class BEEC1038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int productCode = input.nextInt();
        int quantity = input.nextInt();

        double total = 0;

        if (productCode == 1) {
            total = quantity * 4.00;
        } else if (productCode == 2) {
            total = quantity * 4.50;
        } else if (productCode == 3) {
            total = quantity * 5.00;
        } else if (productCode == 4) {
            total = quantity * 2.00;
        } else if (productCode == 5) {
            total = quantity * 1.50;
        }

        System.out.println("Total: R$ " + String.format("%.2f", total));
    }
}