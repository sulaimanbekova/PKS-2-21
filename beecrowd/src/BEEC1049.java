import java.util.Scanner;

public class BEEC1049 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word1 = input.nextLine();
        String word2 = input.nextLine();
        String word3 = input.nextLine();
        input.close();

        if (word1.equals("vertebrado")) {
            if (word2.equals("ave")) {
                if (word3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (word3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (word2.equals("mamifero")) {
                if (word3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (word3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (word1.equals("invertebrado")) {
            if (word2.equals("inseto")) {
                if (word3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (word3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (word2.equals("anelideo")) {
                if (word3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (word3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}

