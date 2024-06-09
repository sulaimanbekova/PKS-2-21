import java.util.Scanner;

public class BEEC1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        int remainingMonths = remainingDays % 30;
        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(remainingMonths + " dia(s)");
    }
}

