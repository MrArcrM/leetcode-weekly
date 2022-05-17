package org.tayg.caiyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCheckString5967 {
    @Test
    public void TestCheckString() {
        CheckString5967 check = new CheckString5967();
        String s = "aaabbb";
        boolean res = check.checkString(s);
        boolean trueResult = true;
        assertEquals(res, trueResult);

        CheckString5967 check1 = new CheckString5967();
        String s1 = "abab";
        boolean res1 = check1.checkString(s1);
        boolean trueResult1 = false;
        assertEquals(res1, trueResult1);

        CheckString5967 check2 = new CheckString5967();
        String s2 = "bbb";
        boolean res2 = check2.checkString(s2);
        boolean trueResult2 = true;
        assertEquals(res2, trueResult2);

    }
}
