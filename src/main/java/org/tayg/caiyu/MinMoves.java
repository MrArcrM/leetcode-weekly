package org.tayg.caiyu;

/**
 * 2139. 得到目标值的最少行动次数
 * https://leetcode.cn/problems/minimum-moves-to-reach-target-score/
 * 
 * 
 * 你正在玩一个整数游戏。从整数 1 开始，期望得到整数 target 。
 * 在一次行动中，你可以做下述两种操作之一：
 * 递增，将当前整数的值加 1（即， x = x + 1）。
 * 加倍，使当前整数的值翻倍（即，x = 2 * x）。
 * 在整个游戏过程中，你可以使用 递增 操作 任意 次数。但是只能使用 加倍 操作 至多 maxDoubles 次。
 * 给你两个整数 target 和 maxDoubles ，返回从 1 开始得到 target 需要的最少行动次数。
 * 
 * 
 * 解题思路： 逆向思维
 * 
 * 目的是将给定的整数 target 变为1；
 * 先判断加倍次数 maxDoubles是否不为0 && 整数 target 是否不为1；（判断是否可以进行折半操作）
 * 再判断整数 target 的奇偶性，奇数则只能递减 1；若为偶数且 maxDoubles 不为0，则折半；
 * 
 * 若加倍次数 maxDoubles为0时，则整数 target 只有递减。
 * 
 */

public class MinMoves {
    public int minMoves(int target, int maxDoubles) {

        int count = 0;
        while (target != 1 && maxDoubles != 0) {
            ++count;
            if (target % 2 == 0) {
                target = target / 2;
                maxDoubles--;
            } else {
                target--;
            }
        }
        count += (target - 1);
        return count;
    }
}
