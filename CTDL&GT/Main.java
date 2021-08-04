public class Main {
 
    public static void main(String[] args) {
        Main main = new Main();
        int result = main.findMaxConsecutiveOnes(new int[] {0, 1, 1, 0, 1, 0, 1, 1});
        System.out.println(result);
    }
 
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }
        }
        if (max < count) {
            max = count;
        }
        return max;
    }
}