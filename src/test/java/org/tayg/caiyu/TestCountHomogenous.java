package org.tayg.caiyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCountHomogenous {

    @Test
    public void Test() {
        CountHomogenous co = new CountHomogenous();
        String s = "abbcccaa";
        int res = co.countHomogenous(s);
        int trueResult = 13;
        assertEquals(res, trueResult);
    }
}
