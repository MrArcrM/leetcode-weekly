package org.tayg.guogan;

import java.util.HashSet;

public class CountPoints5952 {
    /**
     * 解题思路：
     * 1. 初始化10条杆子，用9个 HashSet
     * 2. 遍历rings，更新9个 HashSet 的值
     * 2. 遍历9个 HashSet，统计有三种颜色的杠子个数
     */
    
     public int countPoles(String rings) {

        //1.初始化10条杆子
        int poleNum = 10;
        HashSet<Character>[] poles = initPoles(poleNum);
        
        //2.遍历rings，更新每一条杆子的值
        poles = updatePoles(poles, rings);

        

        //3.计算有多少条杆子上有3个环
        int count = countPoleNum(poles);
        return count;
     }


    private HashSet<Character>[] updatePoles(HashSet<Character>[] poles,String rings) {
        for (int i = 0; i < rings.length(); i += 2) {
            Character color = rings.charAt(i);
            Character idxChar = rings.charAt(i + 1);
            int idx = Character.getNumericValue(idxChar);
            poles[idx].add(color);
        }
        return poles;
    }

    private int countPoleNum(HashSet<Character>[] poles) {
        int count = 0;
        for (int i = 0; i < poles.length; i++) {
            if (poles[i].size() == 3) {
                count ++;
            }
        }
        return count;
    }

     private HashSet<Character>[] initPoles(int poleNum) {
        HashSet<Character>[] poles = new HashSet[poleNum];
        for (int i = 0; i < poleNum; i++) {
            poles[i] = new HashSet<>();
        }
        return poles;
     }
}
