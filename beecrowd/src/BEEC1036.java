import java.util.Scanner;

public class BEEC1036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double delta = B * B - 4 * A * C;

        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.println("R1 = " + String.format("%.5f", R1));
            System.out.println("R2 = " + String.format("%.5f", R2));
        }
    }
}

