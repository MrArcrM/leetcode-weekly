package org.tayg.guoqu.week274;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAsteroidsDestroyed5969 {
    AsteroidsDestroyed5969 solution = new AsteroidsDestroyed5969();

    @Test
    public void testAsteroidsDestroyed() {
        int mass = 10;
        int[] asteroids = { 3, 9, 19, 5, 21 };
        boolean trueRes = true;
        boolean res = solution.asteroidsDestroyed(mass, asteroids);
        assertEquals(trueRes, res);
    }
}
