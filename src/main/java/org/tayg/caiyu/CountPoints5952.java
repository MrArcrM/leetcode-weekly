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
        //为每条杠创建一个 HashSet 
        int polesNum = 10;
        HashSet<Character>[] poles = getPoles(polesNum);

        //遍历rings，更新杠上的颜色
        updatePoles(rings, poles);
        
        //获取杠上有三种颜色的 条数
        int count = 0;
        count = getCount(poles, count);
        
        return count;
    }

    private int getCount(HashSet<Character>[] poles, int count) {
        for(HashSet<Character> pole:poles){
            if(pole.size()==3){
                count++;
            }
        }
        return count;
    }

    private void updatePoles(String rings, HashSet<Character>[] poles) {
        for(int i = 0; i < rings.length(); i += 2){
            int index = Character.getNumericValue(rings.charAt(i+1));
            poles[index].add(rings.charAt(i));
        }
    }

    private HashSet<Character>[] getPoles(int polesNum) {
        HashSet<Character>[] poles = new HashSet[polesNum];
        for(int i = 0; i < polesNum; i++){
            poles[i] = new HashSet<>();
        }
        return poles;
    }


}
