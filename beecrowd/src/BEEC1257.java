import java.util.Scanner;

public class BEEC1257 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        for (int i = 0; i < T; i++) {
            int L = input.nextInt();
            input.nextLine();
            int hash = 0;
            for (int j = 0; j < L; j++) {
                String line = input.nextLine();
                for (int k = 0; k < line.length(); k++) {
                    char c = line.charAt(k);
                    int alphabetPosition = c - 'A';
                    hash += alphabetPosition + j + k;
                }
            }
            System.out.println(hash);
        }
    }
}
