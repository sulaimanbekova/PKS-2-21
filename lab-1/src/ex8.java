import java.util.Arrays;
import java.util.List;

public class ex8 {
    public static void main(String[] args) {

        List<String> correctAnswers = Arrays.asList("A", "C", "B", "D", "A", "B", "C", "D", "A", "C",
                "B", "D", "A", "B", "C", "D", "A", "C", "B", "D");


        List<String> studentAnswers = Arrays.asList("A", "D", "B", "C", "A", "B", "D", "C", "A", "C",
                "B", "D", "A", "B", "C", "D", "A", "B", "C", "D");


        int correctCount = 0;
        int incorrectCount = 0;

        for (int i = 0; i < correctAnswers.size(); i++) {
            if (correctAnswers.get(i).equals(studentAnswers.get(i))) {
                correctCount++;
            } else {
                incorrectCount++;
            }
        }


        System.out.println("Правильные ответы: " + correctCount);
        System.out.println("Неправильные ответы: " + incorrectCount);
    }
}