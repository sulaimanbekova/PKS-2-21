public class ex9 {
    public static void main(String[] args) {
        int[] workHours = {8, 8, 8, 0, 8, 8, 8, 8, 0, 0, 8, 8, 8, 8, 8, 0, 8, 8, 8, 0};
        int workDays = 0;
        int weekCounter = 1;
        int totalHours = 0;


        int weeklyHours = 0;

        for (int i = 0; i < workHours.length; i++) {
            if (workHours[i] != 0) {
                workDays++;
                totalHours += workHours[i];
                weeklyHours += workHours[i];
            }


            if ((i + 1) % 5 == 0 || i == workHours.length - 1) {
                System.out.println("Неделя " + weekCounter + ": " + weeklyHours + " ч");
                weeklyHours = 0;
                weekCounter++;
            }
        }

        double averageHoursPerDay = (double) totalHours / workDays;
        System.out.println("Среднее количество часов в день: " + averageHoursPerDay);
    }
}
