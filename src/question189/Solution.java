package question189;

/**
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * @author user
 * 先将前n-k个数字旋转，然后旋转第n-k个到第n个的数字，最后整体旋转即可
 */

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