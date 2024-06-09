import java.util.Scanner;

public class BEEC1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        System.out.println(amount);

        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

        for (int note : banknotes) {
            int count = amount / note;
            System.out.println(count + " nota(s) de R$ " + note + ",00");

            amount -= count * note;
        }
    }
}
