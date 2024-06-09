import java.util.Scanner;

public class BEEC1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int time = input.nextInt();
        int speed = input.nextInt();

        double distance = time * speed;

        double fuelSpent = distance / 12;

        System.out.println(String.format("%.3f", fuelSpent));
    }
}
