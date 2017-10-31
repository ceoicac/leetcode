package test;

import org.junit.Test;

import question189.Solution;



public class LeetCodeTest {

	@Test
	public void test() {
		int [] nums = {2147483647,-2147483648,33,219,0};
		new Solution().rotate(nums,4);
		for(int i : nums){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
