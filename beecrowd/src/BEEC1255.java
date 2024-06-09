import java.util.Scanner;
public class BEEC1255 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        input.nextLine();
        for (int t = 0; t < T; t++) {
            String line = input.nextLine().toLowerCase();
            int[] count = new int[26];
            int maxCount = 0;
            for (char ch : line.toCharArray()) {
                if (Character.isLetter(ch)) {
                    int index = ch - 'a';
                    count[index]++;
                    maxCount = Math.max(maxCount, count[index]);
                }
            }
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (count[i] == maxCount) {
                    char letter = (char) (i + 'a');
                    result.append(letter);
                }
            }
            System.out.println(result);
        }
    }
}