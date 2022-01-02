package org.tayg.caiyu;

public class ReverseNumTwice5963 {

  public boolean isSameAfterReversals(int num) {
    int reversed1 = num;
    for (int i = 1; i <= 2; i++) {
      reversed1 = reverseNum(reversed1);
    }
    if (num == reversed1) {
      return true;
    }

    return false;
  }

  private int reverseNum(int num) {

    StringBuilder builder = new StringBuilder();
    String s = Integer.toString(num);
    int p1 = 0;
    int p2 = s.length() - 1;
    int res = 0;
    while (p1 < p2) {
      builder.append(s.charAt(p2));
      p2 -= 1;
    }
    builder.append(s.charAt(p2));
    res = Integer.parseInt(builder.toString());
    return res;
  }
}
