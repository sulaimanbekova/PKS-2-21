import java.util.Scanner;

public class BEEC1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSeconds = input.nextInt();
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int seconds = remainingSeconds % 60;
        int minutes = remainingSeconds / 60;
        System.out.printf("%d:%d:%d%n", hours, minutes, seconds);
    }
}
