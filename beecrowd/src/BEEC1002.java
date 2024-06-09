import java.util.Scanner;

public class BEEC1002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double pi = 3.14159;
        double r = in.nextDouble();
        double result = pi * r * r;
        System.out.printf("A=%.4f%n" ,result);
    }
}