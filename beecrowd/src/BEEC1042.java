import java.util.Scanner;

public class BEEC1042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A, B, C, min1, min2 = 0, min3 = 0;
        A = input.nextInt();
        B =  input.nextInt();
        C =  input.nextInt();
        min1 = Math.min(A, Math.min(B, C));

        if (min1 == A) {
            min2 = Math.min(B, C);
            min3 = Math.max(B, C);
        }
        if (min1 == B) {
            min2 = Math.min(A, C);
            min3 = Math.max(A, C);
        }
        if (min1 == C) {
            min2 = Math.min(A, B);
            min3 = Math.max(A, B);
        }
        System.out.println(min1);
        System.out.println(min2);
        System.out.println(min3);
        System.out.println("");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}