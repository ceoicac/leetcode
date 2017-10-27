package question7;

/**
 * 将一个32位整数翻转
 * @author user
 * 注意：检查ret*10后是否溢出
 */

public class Solution {
    public int reverse(int x) {
        boolean flag = false;
        long ret = 0;
        if(x < 0){
            x = -x;
            flag = true;
        }
        while(x > 0){
        	ret = ret*10 + x % 10;
            x /= 10;
        }
        if(ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) 
        	return  0;
        if(flag){
            ret = -ret;
        }
        return (int)ret;
    }
}
