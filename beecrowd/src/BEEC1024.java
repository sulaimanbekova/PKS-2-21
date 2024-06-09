import java.util.Scanner;

public class BEEC1024 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        in.nextLine();
        for (int i = 0; i < num; i++){
            char[] text = in.nextLine().toCharArray();
            for (int j = 0; j < text.length; j++){
                if (Character.isLetter(text[j])){
                    text[j] = (char)(text[j]+3);
                }
            }
            for (int k = 0; k < text.length/2; k++){
                char temp = text[k];
                text[k] = text[text.length-k-1];
                text[text.length-k-1] = temp;
            }
            for (int l = text.length/2; l < text.length; l++){
                text[l] = (char)(text[l]-1);
            }
            System.out.println(text);
        }
    }
}