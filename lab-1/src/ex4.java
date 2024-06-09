import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество минут: ");
        int minutesUsed = scanner.nextInt();
        System.out.print("Количество сообщений: ");
        int messagesUsed = scanner.nextInt();
        scanner.close();
        int includedMinutes = 50;
        int includedMessages = 50;
        double baseCost = 15.00;
        double minuteRate = 0.25;
        double messageRate = 0.15;
        double emergencyFee = 0.44;
        double taxRate = 0.05;
        double additionalMinutesCost = 0.0;
        double additionalMessagesCost = 0.0;

        if (minutesUsed > includedMinutes) {
            additionalMinutesCost = (minutesUsed - includedMinutes) * minuteRate;
        }

        if (messagesUsed > includedMessages) {
            additionalMessagesCost = (messagesUsed - includedMessages) * messageRate;
        }

        double totalCost = baseCost + additionalMinutesCost + additionalMessagesCost + emergencyFee;
        double taxAmount = totalCost * taxRate;
        totalCost += taxAmount;

        System.out.printf("Базовая стоимость: $%.2f\n", baseCost);
        if (additionalMinutesCost > 0) {
            System.out.printf("Дополнительные минуты: $%.2f (%d минут)\n", additionalMinutesCost, minutesUsed - includedMinutes);
        }
        if (additionalMessagesCost > 0) {
            System.out.printf("Дополнительные сообщения: $%.2f (%d сообщений)\n", additionalMessagesCost, messagesUsed - includedMessages);
        }
        System.out.printf("Сбор за 911: $%.2f\n", emergencyFee);
        System.out.printf("Налог: $%.2f (%.0f%% от общей суммы $%.2f)\n", taxAmount, taxRate * 100, totalCost - taxAmount);
        System.out.printf("Итоговая сумма: $%.2f\n", totalCost);
    }
}
