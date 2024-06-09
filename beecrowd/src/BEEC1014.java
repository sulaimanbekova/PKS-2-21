import java.util.Scanner;

public class BEEC1014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance = input.nextDouble();
        double fuel = input.nextDouble();

        System.out.printf("%.3f km/l%n", (distance / fuel));
    }
}


