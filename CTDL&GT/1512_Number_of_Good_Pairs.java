import java.util.HashMap;
import java.util.Map;

public class 1512_Number_of_Good_Pairs {
    public static void main(String[] args) {
        System.out.println(numIdenticalPairs1(new int[] { 1, 2, 3 })); // 0
        System.out.println(numIdenticalPairs1(new int[] { 1, 2, 3, 1, 1, 3 })); // 4
        System.out.println(numIdenticalPairs1(new int[] { 1, 1, 1, 1 })); // 6
    }

    public static int numIdenticalPairs(int[] nums) {
        // 1 ms 35.8 MB
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }