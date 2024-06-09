import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BEEC1021 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] notes = {100.00,50.00,20.00,10.00,5.00,2.00};
        double[] coins = {1.00,0.50,0.25,0.10,0.05,0.01};
        double num = in.nextDouble();

        DecimalFormat df = new DecimalFormat("#0.00");
        num = Double.parseDouble(df.format(num));

        int[] resultNotes = new int[notes.length];
        int[] resultCoins = new int[notes.length];
        boolean isChanged = false;
        double remainder = 0;
        for (int i = 0; i < notes.length; i++) {
            remainder = num%notes[i];
            int track = (int) ((int) num/notes[i]);
            num = remainder;
            if (track >= 1)
            {
                isChanged = true;
                resultNotes[i] = track;
            }else {
                resultNotes[i] = 0;
            }
        }

        double remainder2 =0;
        remainder = isChanged ? num : remainder;
        remainder = Double.parseDouble(df.format(remainder));
        for (int i = 0; i < resultNotes.length; i++) {
            remainder2 =  remainder%coins[i];
            int division = (int) (remainder/coins[i]);
            remainder = Double.parseDouble(df.format(remainder2));
            if (division >= 1) {
                resultCoins[i] = division;
            }else{
                resultCoins[i] = 0;
            }
        }
        System.out.println("NOTAS:");
        for (int i = 0; i < resultNotes.length; i++) {
            System.out.printf("%d nota(s) de R$ %.2f\n",resultNotes[i], notes[i]);
        }
        System.out.println("MOEDAS:");
        for (int i = 0; i < resultCoins.length; i++) {
            System.out.printf("%d moeda(s) de R$ %.2f\n",resultCoins[i], coins[i]);
        }
    }
}