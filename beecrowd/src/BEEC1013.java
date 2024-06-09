import java.util.Scanner;

public class BEEC1013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int greatest = Math.max(a, Math.max(b, c));

        System.out.println(greatest + " eh o maior");
    }
}
