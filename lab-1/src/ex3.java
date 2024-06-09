import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {
        List<Integer> nums1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        List<Integer> nums2 = List.of(0, 2, 1, 9, 7);
        List<Integer> nums3 = new ArrayList<>(nums2);

        for (int num : nums1) {
            if (!nums2.contains(num)) {
                nums3.add(num);
            }
        }

        System.out.println("nums3: " + nums3);
    }
}
