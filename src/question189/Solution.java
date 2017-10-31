package question189;

public class Solution {
    public void rotate(int[] nums, int k) {
        if(k <= 0){
            return;
        }
        if(k > nums.length){
            k = k % nums.length;
        }
        for(int i = 0;i < (nums.length - k) / 2; ++i){
            int tmp = nums[i];
            nums[i] = nums[nums.length - k - i - 1];
            nums[nums.length - k - i - 1] = tmp;
        }
        int m = 0;
        for(int i = nums.length - k;i < (nums.length - k + nums.length) / 2; ++i){
            int tmp = nums[i];
            nums[i] = nums[nums.length - m - 1];
            nums[nums.length - m - 1] = tmp;
            m++;
        }
        
         for(int i = 0;i < nums.length / 2; ++i){
            int tmp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = tmp;
        }
    }
}