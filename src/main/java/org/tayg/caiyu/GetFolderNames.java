package org.tayg.caiyu;

import java.util.HashMap;
import java.util.Map;

/**
 * 1487. 保证文件名唯一
 * https://leetcode.cn/problems/making-file-names-unique/
 * 
 * 给你一个长度为 n 的字符串数组 names 。你将会在文件系统中创建 n 个文件夹：在第 i 分钟，新建名为 names[i] 的文件夹。
 * 由于两个文件 不能 共享相同的文件名，因此如果新建文件夹使用的文件名已经被占用，系统会以 (k) 的形式为新文件夹的文件名添加后缀，其中 k
 * 是能保证文件名唯一的 最小正整数 。
 * 返回长度为 n 的字符串数组，其中 ans[i] 是创建第 i 个文件夹时系统分配给该文件夹的实际名称。
 * 
 * 示例 1：
 * 输入：names = ["gta","gta(1)","gta","avalon"]
 * 输出：["gta","gta(1)","gta(2)","avalon"]
 * 解释：文件系统将会这样创建文件名：
 * "gta" --> 之前未分配，仍为 "gta"
 * "gta(1)" --> 之前未分配，仍为 "gta(1)"
 * "gta" --> 文件名被占用，系统为该名称添加后缀 (k)，由于 "gta(1)" 也被占用，所以 k = 2 。实际创建的文件名为 "gta(2)"
 * 。
 * "avalon" --> 之前未分配，仍为 "avalon"
 * 
 * 
 * 示例 2：
 * 输入：names = ["onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece"]
 * 输出：["onepiece","onepiece(1)","onepiece(2)","onepiece(3)","onepiece(4)"]
 * 解释：当创建最后一个文件夹时，最小的正有效 k 为 4 ，文件名变为 "onepiece(4)"。
 * 
 * 解题思路：
 * 用一个 HashMap<String,Integer> map集合来存储相同字符串的数量
 * 遍历 names 数组时，先判断map 集合中是否存在，不存在就添加到map、ans 数组中，
 * 存在则遍历map 集合，看看有多少个，每找到一个 count++ ，最后更新 map，并存到ans 数组中。
 * 
 * 
 */

public class GetFolderNames {

    public String[] getFolderNames(String[] names) {

        Map<String, Integer> map = new HashMap<>();
        String[] ans = new String[names.length];
        Integer count = 0;
        for (int i = 0; i < names.length; i++) {
            if (map.containsKey(names[i])) {
                String key = names[i];
                Integer value = map.get(key);
                count = value;
                while (map.containsKey(key + "(" + count + ")")) {
                    count++;
                }
                map.put(key + "(" + count + ")", 1);
                map.put(key, value + 1);
                ans[i] = key + "(" + count + ")";
            } else {
                map.put(names[i], 1);
                ans[i] = names[i];
            }
        }

        return ans;
    }

}
