package org.tayg.caiyu;

/** LeetCode竞赛题-5957 向字符串添加空格 */
public class AddSpaces5957 {
  /**
   * addSpaces() 在字符串指定位置添加空格 解题思路： 利用双指针，p1 在字符串 s 上移动，p2 在数组 spaces 上移动 p1 指针小于 spaces 数组中 p2
   * 指针位置的值时，将字符串 s 上 p1 指针指向的字符添加到 StringBuild 中，并使 p1 右移一位； 若 p1 指针等于 spaces 数组中 p2 指针位置的值时，往
   * StringBuild 中添加空格，并使 p2 指针右移一位。 若 p1 指针不满足以上条件时（即 p1 > p2 )，那么将剩下的字符全部添加到 StringBuild 中。 最后返回
   * StringBuild.toString() 字符串
   *
   * @param s 输入的字符串
   * @param spaces 需要添加空格的位置
   * @return 添加空格后的字符串
   */
  public String addSpaces(String s, int[] spaces) {
    // 用于存储拼接字符串
    StringBuilder res = new StringBuilder();
    // 利用双指针
    int p1 = 0;
    int p2 = 0;

    while (p1 < s.length() && p2 < spaces.length) {
      if (p1 < spaces[p2]) {
        res.append(s.charAt(p1));
        p1 += 1;
      } else if (p1 == spaces[p2]) {
        res.append(" ");
        p2 += 1;
      }
    }

    while (p1 < s.length()) {
      res.append(s.charAt(p1));
      p1 += 1;
    }

    return res.toString();
  }
}
