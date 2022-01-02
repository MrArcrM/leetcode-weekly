package org.tayg.guoqu.week274;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * solution for https://leetcode-cn.com/problems/destroying-asteroids/
 */
public class AsteroidsDestroyed5969 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        // 1. 把行星按质量从小到大排序
        Arrays.sort(asteroids);
        // 2. 最稳妥的方式，是每次吸收质量最小的行星
        BigDecimal plantMass = new BigDecimal(mass);
        for (int asteroid : asteroids) {
            BigDecimal asteroidMass = new BigDecimal(asteroid);
            if (plantMass.compareTo(asteroidMass) < 0) {
                return false;
            }
            plantMass = plantMass.add(asteroidMass);
        }

        return true;
    }
}
