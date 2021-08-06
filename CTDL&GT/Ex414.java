import java.util.Arrays;

public class Ex414 {

    public int thirdMax(int[] nums) {
        byte count = 1;
        int p = 0;
        Arrays.sort(nums);
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] != nums[i+1] && ++count == 3) {
                p = i;
                break;    
            };
        }
        return count == 2 ? nums[nums.length - 1] : nums[p];
    }
}

