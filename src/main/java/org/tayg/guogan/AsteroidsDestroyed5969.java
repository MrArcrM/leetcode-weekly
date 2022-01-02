package org.tayg.guogan;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * 解题思路：
 * 1. 把行星按质量从小到大进行排列
 * 2. 遍历小行星数组
 * 3. 比较大行星与小行星的质量，如果大于则加上小星星的质量，小于则返回false
 */

public class AsteroidsDestroyed5969 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        BigDecimal planetMass = new BigDecimal(mass);
        for (int asteroid : asteroids) {
            BigDecimal asteroidMass = new BigDecimal(asteroid);
            if (planetMass.compareTo(asteroidMass) < 0) {
                return false;
            }
            planetMass = planetMass.add(asteroidMass);
        }
        return true;
    }
}
