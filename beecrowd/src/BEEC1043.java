import java.util.Scanner;

public class BEEC1043 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        double perimeter = A + B + C;

        if (A + B > C && A + C > B && B + C > A) {
            System.out.printf("Perimetro = %.1f%n", perimeter);
        } else {
            double area = ((A + B) * C) / 2.0;
            System.out.printf("Area = %.1f%n", area);
        }
    }
}