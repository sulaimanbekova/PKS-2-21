import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            BigIntegerCustom big1 = new BigIntegerCustom("131231");
            BigIntegerCustom big2 = new BigIntegerCustom("134");

            ArrayList<Integer> addResult = BigIntegerCustom.addBigInt(big1, big2);
            System.out.println("Add Result: " + addResult);

            ArrayList<Integer> subtractResult = BigIntegerCustom.subtractBigInt(big1, big2);
            System.out.println("Subtraction Result: " + subtractResult);

            ArrayList<Integer> multiplyResult = BigIntegerCustom.multiplyBigInt(big1, big2);
            System.out.println("Multiplication Result: " + multiplyResult);

            ArrayList<Integer> divideResult = BigIntegerCustom.divideBigInt(big1, big2);
            System.out.println("Division Result: " + divideResult);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
