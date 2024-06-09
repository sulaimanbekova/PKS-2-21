import java.util.Scanner;

public class BEEC1235 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = Integer.parseInt(input.nextLine());
    for (int i = 0; i < n; i++) {
        String scrambledLine = input.nextLine();
        int length = scrambledLine.length();
        int halfLength = length / 2;
        String leftHalf = scrambledLine.substring(0, halfLength);
        String rightHalf = scrambledLine.substring(halfLength);
        String unscrambledLeft = new StringBuilder(leftHalf).reverse().toString();
        String unscrambledRight = new StringBuilder(rightHalf).reverse().toString();
        String unscrambledLine = unscrambledLeft + unscrambledRight;
        System.out.println(unscrambledLine);
    }
  }
}
