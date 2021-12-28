package org.tayg.caiyu;

/** LeetCode竞赛题-5956 找出数组中的第一个回文字符串 */
public class FindPalindromeString5956 {
  /**
   * firstPalindrome() 返回数组中的 第一个回文字符串 解题思路： 利用双指针 p1 p2, p1 指针从左往右移动，p2 指针从右往左移动 如果 p1 < p2,比较 p1
   * 指针对应的字符与 p2 指针对应的字符是否相同，若相同则 p1 右移一位，p2 左移一位；若不同则返回 false； （word 长度为奇数时，中心位不用处理，word
   * 长度为偶数时，会被比较） 循环结束后返回 一个回文字符串（即数组中的第一个回文字符串）。
   *
   * @param words 输入的数组
   * @return 数组中的 第一个回文字符串
   */
  public String firstPalindrome(String[] words) {
    for (String word : words) {
      // isPalindrome() 方法用于判断的该字符串是否是回文字符串
      if (isPalindrome(word)) {
        return word;
      }
    }
    return "";
  }

  private boolean isPalindrome(String word) {
    int p1 = 0;
    int p2 = word.length() - 1;
    while (p1 < p2) {
      if (word.charAt(p1) != word.charAt(p2)) {
        return false;
      }
      p1 += 1;
      p2 -= 1;
    }

    return true;
  }
}
