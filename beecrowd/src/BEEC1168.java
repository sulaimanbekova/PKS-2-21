import java.util.Scanner;

public class BEEC1168 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            String value = input.nextLine();
            int leds = countLEDs(value);
            System.out.println(leds + " leds");
        }
    }

    public static int countLEDs(String value) {
        int totalLEDs = 0;
        int[] LEDCount = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        for (int i = 0; i < value.length(); i++) {
            int digit = Character.getNumericValue(value.charAt(i));
            totalLEDs += LEDCount[digit];
        }

        return totalLEDs;
    }
}