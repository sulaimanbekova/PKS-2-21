import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        System.out.println(finalState(List.of("Dislike")));
        System.out.println(finalState(List.of("Like", "Like")));
        System.out.println(finalState(List.of("Dislike", "Like")));
        System.out.println(finalState(List.of("Like", "Dislike", "Dislike")));
        System.out.println(finalState(List.of("Like", "Dislike", "Like")));
        System.out.println(finalState(List.of("Dislike", "Dislike")));
        System.out.println(finalState(List.of("Like", "Dislike", "Dislike", "Like", "Like")));
        System.out.println(finalState(List.of("Dislike", "Like", "Dislike", "Like", "Dislike")));
        System.out.println(finalState(List.of()));
        System.out.println(finalState(List.of("Like")));
        System.out.println(finalState(List.of("Dislike", "Like", "Like", "Dislike", "Dislike")));
    }

    public static String finalState(List<String> actions) {
        if (actions.isEmpty()) {
            return "Nothing";
        }

        String currentState = "Nothing";

        for (String action : actions) {
            if (action.equals("Like")) {
                if (currentState.equals("Like")) {
                    currentState = "Nothing";
                } else {
                    currentState = "Like";
                }
            } else if (action.equals("Dislike")) {
                if (currentState.equals("Dislike")) {
                    currentState = "Nothing";
                } else {
                    currentState = "Dislike";
                }
            }
        }

        return currentState;
    }
}
