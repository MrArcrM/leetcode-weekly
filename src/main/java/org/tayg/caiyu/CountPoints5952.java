package org.tayg.caiyu;

import java.util.HashSet;

public class CountPoints5952 {
    /**
     * 实现思路：
     * 1.创建 10个 HashSet 存储 10根杠 (0-9)
     * 2.遍历rings 更新10个 HashSet 的值
     * 3.遍历10个 HashSet 的长度，统计有三种颜色的杠数量
     * 
     * @param rings
     * @return
     */
    public int CountPoints(String rings){
        int polesNum = 10;
        HashSet<Character>[] poles = new HashSet[polesNum];
        for(int i = 0; i < polesNum; i++){
            poles[i] = new HashSet<>();
        }
        for(int i = 0; i < rings.length(); i += 2){
            int index = Character.getNumericValue(rings.charAt(i+1));
            poles[index].add(rings.charAt(i));
        }
        int count = 0;
        for(HashSet<Character> pole:poles){
            if(pole.size()==3){
                count++;
            }
        }
        
        

        return count;
    }
}
