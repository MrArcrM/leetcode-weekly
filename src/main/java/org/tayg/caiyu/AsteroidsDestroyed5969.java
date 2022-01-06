package org.tayg.caiyu;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * LeetCode 竞赛题-5969 摧毁小行星
 * https://leetcode-cn.com/problems/destroying-asteroids/
 * 
 * 题意：
 * 给你一个整数 mass ，它表示一颗行星的初始质量。再给你一个整数数组 asteroids ，其中 asteroids[i] 是第 i 颗小行星的质量。你可以按
 * 任意顺序 重新安排小行星的顺序，然后让行星跟它们发生碰撞。
 * 如果行星碰撞时的质量 大于等于 小行星的质量，那么小行星被 摧毁 ，并且行星会 获得 这颗小行星的质量。否则，行星将被摧毁。
 * 如果所有小行星 都 能被摧毁，请返回 true ，否则返回 false 。
 * 
 * 解题思路：
 * 重点：将 mass 、 asteroids[i] 都转为 BigDecimal 类型，因为数值过大。
 * 先将数组进行升序排序，再将 mass 、 asteroids[i] 都转为 BigDecimal 类型，然后遍历 asteroids 数组中的小行星，比较
 * mass 和 asteroids[i] 的质量大小，若大于或等于则两者相加，小于则返回 false。
 * 如果 mass 大于等于 asteroids[i]，那么相加赋值给 mass；
 * 如果 mass 小于 asteroids[i]，那么直接返回 false；
 * 
 */

public class AsteroidsDestroyed5969 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        BigDecimal bigmass = new BigDecimal(mass);
        for (int i = 0; i < asteroids.length; i++) {
            BigDecimal bigAsteroids = new BigDecimal(asteroids[i]);
            if (bigmass.compareTo(bigAsteroids) >= 0) {
                bigmass = bigmass.add(bigAsteroids);
            } else {
                return false;
            }
        }
        return true;
    }
}
