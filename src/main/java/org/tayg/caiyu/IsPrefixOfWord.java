package org.tayg.caiyu;

/**
 * 1455. 检查单词是否为句中其他单词的前缀
 * https://leetcode.cn/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
 * 
 * 给你一个字符串 sentence 作为句子并指定检索词为 searchWord ，其中句子由若干用 单个空格 分隔的单词组成。请你检查检索词
 * searchWord 是否为句子 sentence 中任意单词的前缀。
 * 如果 searchWord 是某一个单词的前缀，则返回句子 sentence 中该单词所对应的下标（下标从 1 开始）。如果 searchWord
 * 是多个单词的前缀，则返回匹配的第一个单词的下标（最小下标）。如果 searchWord 不是任何单词的前缀，则返回 -1 。
 * 字符串 s 的 前缀 是 s 的任何前导连续子字符串。
 * 
 * 示例 1：
 * 
 * 输入：sentence = "i love eating burger", searchWord = "burg"
 * 输出：4
 * 解释："burg" 是 "burger" 的前缀，而 "burger" 是句子中第 4 个单词。
 * 
 * 解题思路：
 * 将句子字符串 sentence 按空格分隔，遍历数组
 * 将每个值截取为和字符串 searchWord 一样的长度，然后判断是否相同，
 * 是则返回 i + 1，不是则返回 -1
 * 
 */

public class IsPrefixOfWord {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");
        int l = searchWord.length();
        for (int i = 0; i < s.length; i++) {
            int n = s[i].length();
            if (n < l) {
                continue;
            }
            String sb = s[i].substring(0, l);
            if (sb.equals(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }

}
