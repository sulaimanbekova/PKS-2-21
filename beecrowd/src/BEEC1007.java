import java.util.Scanner;

public class BEEC1007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        int difference = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + difference);
    }
}