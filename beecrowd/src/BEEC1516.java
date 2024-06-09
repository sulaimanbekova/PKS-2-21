import java.util.Scanner;

public class BEEC1516 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int N = input.nextInt();
            int M = input.nextInt();
            if (N == 0 && M == 0) {
                break;
            }

            input.nextLine();

            char[][] drawing = new char[N][M];
            for (int i = 0; i < N; i++) {
                drawing[i] = input.nextLine().toCharArray();
            }

            int A = input.nextInt();
            int B = input.nextInt();

            int vScale = A / N;
            int hScale = B / M;

            for (int i = 0; i < N; i++) {
                for (int vi = 0; vi < vScale; vi++) {
                    StringBuilder line = new StringBuilder();
                    for (int j = 0; j < M; j++) {
                        for (int hj = 0; hj < hScale; hj++) {
                            line.append(drawing[i][j]);
                        }
                    }
                    System.out.println(line);
                }
            }

            System.out.println();
        }
    }
}