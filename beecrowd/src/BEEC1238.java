import java.util.Scanner;
public class BEEC1238 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++) {
            String[] strings = input.nextLine().split(" ");
            String result = combine(strings[0], strings[1]);
            System.out.println(result);
        }
    }
    public static String combine(String s1, String s2) {
        StringBuilder combined = new StringBuilder();

        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            combined.append(s1.charAt(i)).append(s2.charAt(i));
        }

        if (s1.length() > minLength) {
            combined.append(s1.substring(minLength));
        } else if (s2.length() > minLength) {
            combined.append(s2.substring(minLength));
        }
        return combined.toString();
    }
}
