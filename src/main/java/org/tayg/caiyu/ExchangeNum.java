package org.tayg.caiyu;

/**
 * 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 * 
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 * 
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 * 
 * 解题思路： 收尾指针
 * 
 * 利用左指针从左往右搜索首个偶数，右指针从右往左搜索首个奇数，然后互换位置。
 * 
 */

public class ExchangeNum {
    public int[] exchange(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int temp;
        while (left < right) {
            while (left < right && nums[left] % 2 != 0) {
                left++;
            }
            while (left < right && nums[right] % 2 == 0) {
                right--;
            }
            temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
        }
        return nums;
    }
}
