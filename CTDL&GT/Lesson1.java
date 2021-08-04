class Solution_26 {
    public int removeDuplicates(int[] nums) {
if (nums.length == 0) return 0;
int i = 0;
for (int j = 1; j < nums.length; j++) {
    if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
    }
}
return i + 1;
  }
}   

class Solution_485 {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int count=0,max=0;
      for (int i=0; i<nums.length; i++)
      {
          if(nums[i]==1)
          {    
              count++;
          }
          else
          {
              max=Math.max(max,count);
              count=0;
          }
      }
         return Math.max(count,max);
    }
}


class Solution_977 {
    public int[] sortedSquares(int[] nums) {
        
        int length = nums.length;
        int[] result = new int[length];
        int left =0, right = length-1;
        int l2, r2;
        int i=length-1;
        while(left<=right){
            l2 = nums[left]*nums[left];
            r2 = nums[right]*nums[right];
            if(r2>l2){
                result[i--] = r2;
                right--;
            } else{
                result[i--] = l2;
                left++;
            }
        }
        
        return result;
    }
}
