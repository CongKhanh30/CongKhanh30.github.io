public class 896_Monotonic_Array {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[] { 1, 2, 2, 3 }));
        System.out.println(isMonotonic(new int[] { 6, 5, 4, 4 }));
        System.out.println(isMonotonic(new int[] { 1, 3, 2 }));
        System.out.println(isMonotonic(new int[] { 1, 2, 4, 5 }));
        System.out.println(isMonotonic(new int[] { 1, 1, 1 }));
        System.out.println(isMonotonic(new int[] { 1, 1, 0 }));
        System.out.println(isMonotonic(new int[] { 1, 1, 2 }));
    }
    public static boolean isMonotonic1(int[] nums) {
       
        boolean increase = true, decrease = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                increase = false;
            if (nums[i] < nums[i + 1])
                decrease = false;
        }
        return increase || decrease;
    }
}
