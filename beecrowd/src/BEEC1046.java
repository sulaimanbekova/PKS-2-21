import java.util.Scanner;

public class BEEC1046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start = input.nextInt();
        int end = input.nextInt();

        int duration;
        if (start < end) {
            duration = end - start;
        } else {
            duration = 24 - start + end;
        }

        System.out.println("O JOGO DUROU " + duration + " HORA(S)");
    }
}
