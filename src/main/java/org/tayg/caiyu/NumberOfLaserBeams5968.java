package org.tayg.caiyu;

/**
 * LeetCode 竞赛题-5968 银行中的激光束数量
 * https://leetcode-cn.com/problems/number-of-laser-beams-in-a-bank/
 * 
 * 解题思路：
 * 遍历 bank 数组，统计每行的激光束数量。若 bank[i]中的字符为 ‘1’,则数量 +1 ；
 * 计算每行与下一行的乘积，然后全部相加得到最终的激光束数量。
 * 
 */

public class NumberOfLaserBeams5968 {
    /**
     * 计算总的激光束数量
     * 
     * @param bank 一个下标从 0 开始的二进制字符串数组
     * @return res 总的激光束数量
     */
    public int numberOfBeams(String[] bank) {
        int[] nums = getBeamsCount(bank);
        int res = 0;
        for (int i = 0; i < bank.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > 0) {
                    int tempCount = nums[i] * nums[j];
                    res += tempCount;
                    break;
                }
            }
        }
        return res;
    }

    /**
     * 获取所有行的激光束数量
     * 
     * @param bank 一个下标从 0 开始的二进制字符串数组
     * @return numsi数组 获取所有行的激光束数量
     */
    private int[] getBeamsCount(String[] bank) {
        int[] numsi = new int[bank.length];
        for (int i = 0; i < bank.length; i++) {
            int count = 0;
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') {
                    count++;
                }
            }
            numsi[i] = count;
        }

        return numsi;
    }
}
