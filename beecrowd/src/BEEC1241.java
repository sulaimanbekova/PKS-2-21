import java.util.Scanner;

public class BEEC1241 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++) {
            String A = input.next();
            String B = input.next();

            if (A.endsWith(B)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
    }
}
