package org.tayg.caiyu;

import org.junit.jupiter.api.Test;

public class TestAddSpaces5957 {
  AddSpaces5957 addSpaces = new AddSpaces5957();

  @Test
  public void AddSpaces5957() {
    String s = "LeetcodeHelpsMeLearn";
    int[] spaces = {8, 13, 15};
    String str = addSpaces.addSpaces(s, spaces);
    System.out.println(str);

    String s1 = "icodeinpython";
    int[] spaces1 = {1, 5, 7, 9};
    String str1 = addSpaces.addSpaces(s1, spaces1);
    System.out.println(str1);

    String s2 = "spacing";
    int[] spaces2 = {0, 1, 2, 3, 4, 5, 6};
    String str2 = addSpaces.addSpaces(s2, spaces2);
    System.out.println(str2);
  }
}
