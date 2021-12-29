package org.tayg.guoqu.week273;

/**
 * Solution for
 * https://leetcode-cn.com/problems/a-number-after-a-double-reversal/
 */
public class IsSameAfterReversals2119 {
    /**
     * 1. 如果 num == 0, 任意反转后都是 0, return True
     * 2-A. 除 0 以外的数, 只要是不以 0 为结尾的（num % 10 != 0）, 反转两次后都是自己
     * 2-B. 只要是以 0 为结尾的, 反转两次后一定不是自己
     * 
     * @param num, input num
     * @return is same after two reversals
     */
    public boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }

        return num % 10 != 0;
    }

}
