import java.util.Scanner;

public class BEEC1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        double B = input.nextDouble();

        double media = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f%n", media);

    }
}

