package org.tayg.caiyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestIsPrefixOfWord {

    @Test
    public void Test() {
        IsPrefixOfWord is = new IsPrefixOfWord();
        String sentence = "hellohello hellohellohello";
        String searchWord = "ell";
        int trueResult = -1;
        int res = is.isPrefixOfWord(sentence, searchWord);
        assertEquals(res, trueResult);

        IsPrefixOfWord is1 = new IsPrefixOfWord();
        String sentence1 = "this problem is an easy problem";
        String searchWord1 = "pro";
        int trueResult1 = 2;
        int res1 = is1.isPrefixOfWord(sentence1, searchWord1);
        assertEquals(res1, trueResult1);
    }

}
