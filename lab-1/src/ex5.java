import java.util.ArrayList;
import java.util.List;

public class ex5 {
    public static void main(String[] args) {
        List<String> transactions = new ArrayList<>();
        transactions.add("Пополнение через банкомат ~ +1000");
        transactions.add("Оплата интернета ~ -500");
        transactions.add("Кафе ~ -300");
        transactions.add("Зарплата ~ +15000");
        transactions.add("Штраф за парковку ~ -2500");
        transactions.add("Подарок ~ +2000");

        int totalBalance = 0;

        for (String transaction : transactions) {
            String[] parts = transaction.split(" ~ ");
            String description = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (amount > 0) {
                totalBalance += amount;
            } else {
                totalBalance -= Math.abs(amount);
            }
        }

        System.out.println("Итоговая сумма на счету составляет " + totalBalance + ".");
    }
}
