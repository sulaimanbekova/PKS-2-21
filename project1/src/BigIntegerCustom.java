import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigIntegerCustom {
    private ArrayList<Integer> list;

    public BigIntegerCustom(String d) {
        for (char c : d.toCharArray()) {
            if (Character.isLetter(c)) {
                throw new IllegalArgumentException("Illegal character: " + c);
            }
        }
        d = d.replaceAll(" ", "");
        list = new ArrayList<>(); //инициализация поля list пустым ArrayList.
        for (int i = 0; i < d.length(); i++) {
            list.add(d.charAt(i) - '0');
        }
    }

    public BigIntegerCustom(List<Integer> list) {
        this.list = new ArrayList<>(list); //здесб инициализируем list копией переданного списка
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public static ArrayList<Integer> addBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        ArrayList<Integer> result = new ArrayList<>();
        int itA = aList.size() - 1;
        int itB = bList.size() - 1;
        int carry = 0, sum = 0;

        while (itA >= 0 || itB >= 0 || carry != 0) {
            sum = carry;
            if (itA >= 0) {
                sum += aList.get(itA--);
            }
            if (itB >= 0) {
                sum += bList.get(itB--);
            }
            carry = sum / 10; //тут мы рассчитываем новое значение переноса как целая часть от деления суммы на 10
            result.add(0, sum % 10); //остаток от деления суммы на 10 добавляется в начало списка result
        }

        return result;
    }

    public static ArrayList<Integer> subtractBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        ArrayList<Integer> result = new ArrayList<>();

        int carry = 0;
        int maxLength = Math.max(aList.size(), bList.size());

        for (int i = 0; i < maxLength; i++) {
            int digitA = (i < aList.size()) ? aList.get(aList.size() - 1 - i) : 0;
            int digitB = (i < bList.size()) ? bList.get(bList.size() - 1 - i) : 0;

            int diff = digitA - digitB - carry;
            if (diff < 0) {
                diff += 10;
                carry = 1;
            } else {
                carry = 0;
            }

            result.add(diff);
        }

        while (result.size() > 1 && result.get(result.size() - 1) == 0) { // тут удаляем ведущие нули
            result.remove(result.size() - 1); //удаление последнего элемента
        }

        Collections.reverse(result); //переворачиваем список result

        return result;
    }


    public static ArrayList<Integer> multiplyBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        int m = aList.size();
        int n = bList.size();
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(m + n, 0));

        for (int i = m - 1; i >= 0; i--) {
            int carry = 0;
            for (int j = n - 1; j >= 0; j--) {
                int mul = aList.get(i) * bList.get(j) + carry + result.get(i + j + 1);
                result.set(i + j + 1, mul % 10); //обновляем значение в рез
                carry = mul / 10; //вычисляем переносс



            }
            result.set(i, result.get(i) + carry);
        }

        while (result.size() > 1 && result.get(0) == 0) {
            result.remove(0);
        }

        return result;
    }


    public static ArrayList<Integer> divideBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> dividend = a.getList();
        ArrayList<Integer> divisor = b.getList();

        if (compareBigInt(a, b) < 0) {
            return new ArrayList<>(Collections.singletonList(0));
        }

        ArrayList<Integer> quotient = new
                ArrayList<>();

        ArrayList<Integer> remainder = new ArrayList<>();

        for (int i = 0; i < dividend.size(); i++) {
            remainder.add(dividend.get(i));
            int quotientDigit = 0;
            while (compareBigInt(new BigIntegerCustom(remainder), b) >= 0) {
                remainder = subtractBigInt(new BigIntegerCustom(remainder), b);
                quotientDigit++;
            }

            quotient.add(quotientDigit);
            while (remainder.size() > 1 && remainder.get(0) == 0) {
                remainder.remove(0);
            }
        }

        while (quotient.size() > 1 && quotient.get(0) == 0) {
            quotient.remove(0);
        }

        return quotient;
    }


    private static int compareBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();

        if (aList == null || bList == null) {
            throw new IllegalArgumentException("Один или оба операнда имеют нулевые списки.");
        }

        int sizeA = aList.size(); //сравниваем раз списков
        int sizeB = bList.size();

        if (sizeA != sizeB) { //если длины равны
            return Integer.compare(sizeA, sizeB); // возвращаем результат сравнения длин
        }

        for (int i = 0; i < sizeA; i++) { //цикл для срав
            int compare = Integer.compare(aList.get(i), bList.get(i));
            if (compare != 0) {
                return compare;
            }
        }

        return 0;
    }
}

