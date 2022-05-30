package org.tayg.caiyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestExchangeNum {

    @Test
    public void Test() {
        ExchangeNum ex = new ExchangeNum();
        int[] nums = { 1, 2, 3, 4 };
        int[] trueResult = { 1, 3, 2, 4 };
        int[] res = ex.exchange(nums);
        assertEquals(res, trueResult);

    }

}
