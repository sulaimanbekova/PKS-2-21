import java.util.Scanner;
public class BEEC1239 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String text = input.nextLine();
            StringBuilder result = new StringBuilder();
            boolean italic = false;
            boolean bold = false;
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                if (ch == '_') {
                    italic = !italic;
                    result.append(italic ? "<i>" : "</i>");
                } else if (ch == '*') {
                    bold = !bold;
                    result.append(bold ? "<b>" : "</b>");
                } else {
                    result.append(ch);
                }
            }
            System.out.println(result);
        }
    }
}
