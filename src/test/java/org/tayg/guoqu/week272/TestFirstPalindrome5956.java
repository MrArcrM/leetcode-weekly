package org.tayg.guoqu.week272;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFirstPalindrome5956 {
  FirstPalindrome5956 solution = new FirstPalindrome5956();

  @Test
  public void testFirstPalindrome() {
    String[] words1 = {"abc", "car", "ada", "racecar", "cool"};
    String trueRes1 = "ada";
    String res1 = solution.firstPalindrome(words1);
    assertEquals(res1, trueRes1);
    String[] words2 = {"notapalindrome", "racecar"};
    String trueRes2 = "racecar";
    String res2 = solution.firstPalindrome(words2);
    assertEquals(res2, trueRes2);
    String[] words3 = {"def", "ghi"};
    String trueRes3 = "";
    String res3 = solution.firstPalindrome(words3);
    assertEquals(res3, trueRes3);
  }
}
