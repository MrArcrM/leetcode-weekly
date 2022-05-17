package org.tayg.caiyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAsteroidsDestroyed5969 {
    @Test
    public void TestAsteroidsDestroyed() {
        AsteroidsDestroyed5969 asteroidsDestroyed = new AsteroidsDestroyed5969();
        int mass = 10;
        int[] asteroids = { 3, 9, 19, 5, 21 };
        boolean res = asteroidsDestroyed.asteroidsDestroyed(mass, asteroids);
        boolean trueResult = true;
        assertEquals(res, trueResult);

        AsteroidsDestroyed5969 asteroidsDestroyed1 = new AsteroidsDestroyed5969();
        int mass1 = 5;
        int[] asteroids1 = { 4, 9, 23, 4 };
        boolean res1 = asteroidsDestroyed1.asteroidsDestroyed(mass1, asteroids1);
        boolean trueResult1 = false;
        assertEquals(res1, trueResult1);
    }
}
