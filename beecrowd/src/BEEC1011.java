import java.io.IOException;
import java.util.Scanner;
public class BEEC1011 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double pi = 3.14159;
        double volume = (4.0 / 3.0) * pi * Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}