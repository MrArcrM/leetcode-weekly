package org.tayg.guogan;

/**
 * 解题思路：
 * 1. 遍历 数组bank 获取每一行的安全设备数量
 * 2. 遍历每一行与下一行的设备激光数量，将上下两行的激光设备
 * 数量相乘得到激光数量，相加得到总激光总数量
 */

public class NumberOfBeams5968 {
    public int numberOfBeams(String[] bank) {
        // 1. 获取每一行的安全设备数量
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
            for (int j = 0; j < bank[j].length(); j++) {
                if (bank[i].charAt(j) == '1') {
                    count++;
                }
            }
            devsCount[i] = count;
        }

        return devsCount;
    }

}
