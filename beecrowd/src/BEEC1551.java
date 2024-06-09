import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BEEC1551 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfTestCases = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numberOfTestCases; i++) {
            String sentence = input.nextLine();

            Set<Character> uniqueLetters = new HashSet<>();

            for (char c : sentence.toCharArray()) {
                if (Character.isLetter(c)) {
                    uniqueLetters.add(c);
                }
            }

            int uniqueLetterCount = uniqueLetters.size();
            if (uniqueLetterCount == 26) {
                System.out.println("frase completa");
            } else if (uniqueLetterCount >= 13) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
        }
    }
}