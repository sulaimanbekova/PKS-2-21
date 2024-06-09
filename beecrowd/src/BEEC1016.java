import java.util.Scanner;

public class BEEC1016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance = input.nextInt();

        double hours = (double) distance / 30;

        int minutes = (int) (hours * 60);

        System.out.println(minutes + " minutos");
    }
}
