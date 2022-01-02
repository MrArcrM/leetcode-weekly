package org.tayg.guoqu.week274;

/**
 * solution for
 * https://leetcode-cn.com/problems/number-of-laser-beams-in-a-bank/
 */
public class NumberOfBeams5968 {
    public int numberOfBeams(String[] bank) {
        // 1. 获取一行 bank 的安全设备数目
        int[] devsCount = getDevsCount(bank);
        // 2. 每一行只与从上往下数有安全设备的第一行有激光束
        int rayCount = 0;
        for (int i = 0; i < devsCount.length; i++) {
            for (int j = i + 1; j < devsCount.length; j++) {
                if (devsCount[j] > 0) {
                    int tempCount = devsCount[i] * devsCount[j];
                    rayCount += tempCount;
                    break;
                }
            }
        }

        return rayCount;
    }

    private int[] getDevsCount(String[] bank) {
        int n = bank.length;
        int[] devsCount = new int[n];
        for (int i = 0; i < bank.length; i++) {
            int count = 0;
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') {
                    count++;
                }
            }
            devsCount[i] = count;
        }

        return devsCount;
    }
}
